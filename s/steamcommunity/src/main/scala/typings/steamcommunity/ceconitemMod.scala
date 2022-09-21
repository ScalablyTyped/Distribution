package typings.steamcommunity

import typings.steamcommunity.mod.appid
import typings.steamcommunity.mod.assetid
import typings.steamcommunity.mod.classid
import typings.steamcommunity.mod.contextid
import typings.steamcommunity.mod.instanceid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ceconitemMod {
  
  inline def apply(item: Any, description: Any, contextID: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(item.asInstanceOf[js.Any], description.asInstanceOf[js.Any], contextID.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * A class which represents an item within the Steam Economy. Returned by calls to {@link CSteamUser#getInventory} or {@link SteamCommunity#getUserInventory}.
    */
  @JSImport("steamcommunity/classes/CEconItem", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with CEconItem {
    def this(item: Any, description: Any, contextID: Any) = this()
    
    /* CompleteClass */
    var actions: js.Array[Any] = js.native
    
    /** How much of this item is in this stack. */
    /* CompleteClass */
    var amount: Double = js.native
    
    /** The ID of the app which owns the item. */
    /* CompleteClass */
    var appid: typings.steamcommunity.mod.appid = js.native
    
    /** Alias of id. */
    /* CompleteClass */
    var assetid: typings.steamcommunity.mod.assetid = js.native
    
    /** The displayed background color, in hexadecimal. */
    /* CompleteClass */
    var background_color: String = js.native
    
    /** The first half of the item cache identifier. The classid is enough to get you basic details about the item. */
    /* CompleteClass */
    var classid: typings.steamcommunity.mod.classid = js.native
    
    /** true if, on the Steam Community Market, this item will use buy orders. false if not. */
    /* CompleteClass */
    var commodity: Boolean = js.native
    
    /** The ID of the context within the app in which the item resides. */
    /* CompleteClass */
    var contextid: typings.steamcommunity.mod.contextid = js.native
    
    /* CompleteClass */
    var currencyid: Any = js.native
    
    /** An array of objects containing information about the item. Displayed under the item's type. */
    /* CompleteClass */
    var descriptions: js.Array[Any] = js.native
    
    /**
      * An array of strings containing "fraud warnings" about the item.
      * In inventories and trades, items with fraud warnings have a red (!) symbol, and fraud warnings are displayed in red under the item's name.
      */
    /* CompleteClass */
    var fraudwarnings: js.Array[Any] = js.native
    
    /**
      * Returns a URL where this item's image can be downloaded.
      */
    /* CompleteClass */
    override def getImageURL(): String = js.native
    
    /**
      * Same as getImageURL(), except for the item's large image, if present.
      */
    /* CompleteClass */
    override def getLargeImageURL(): String = js.native
    
    /**
      * Returns a specific tag from the item, or null if it doesn't exist.
      *
      * @param category A string containing the tag's category (the category property of the tag object).
      */
    /* CompleteClass */
    override def getTag(category: String): Any = js.native
    
    /** The item's unique ID within its app+context. */
    /* CompleteClass */
    var id: String = js.native
    
    /** The second half of the item cache identifier. */
    /* CompleteClass */
    var instanceid: typings.steamcommunity.mod.instanceid = js.native
    
    /* CompleteClass */
    var is_currency: Boolean = js.native
    
    /* CompleteClass */
    var market_fee_app: Double = js.native
    
    /** The item's universal market name. This identifies the item's market listing page (M4A1-S | Nightmare (Field-Tested)...). */
    /* CompleteClass */
    var market_hash_name: String = js.native
    
    /** How many days for which the item will be unmarketable after being sold on the market. */
    /* CompleteClass */
    var market_marketable_restriction: Double = js.native
    
    /** How many days for which the item will be untradable after being sold on the market. */
    /* CompleteClass */
    var market_tradable_restriction: Double = js.native
    
    /** true if the item can be listed on the Steam Community Market, false if not. */
    /* CompleteClass */
    var marketable: Boolean = js.native
    
    /** The item's display name. */
    /* CompleteClass */
    var name: String = js.native
    
    /** The render color of the item's name, in hexadecimal. */
    /* CompleteClass */
    var name_color: String = js.native
    
    /* CompleteClass */
    var owner: Any = js.native
    
    /** The item's position within the inventory (starting at 1). Not defined if this item wasn't retrieved directly from an inventory (e.g. from a trade offer or inventory history). */
    /* CompleteClass */
    var pos: Double = js.native
    
    /** An array of objects containing the item's inventory tags. */
    /* CompleteClass */
    var tags: js.Array[Any] = js.native
    
    /** true if the item can be traded, false if not. */
    /* CompleteClass */
    var tradable: Boolean = js.native
    
    /** The "type" that's shown under the game name to the right of the game icon (Classified Rifle, Extraordinary Collectible, Restricted Rifle...). */
    /* CompleteClass */
    var `type`: String = js.native
  }
  @JSImport("steamcommunity/classes/CEconItem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A class which represents an item within the Steam Economy. Returned by calls to {@link CSteamUser#getInventory} or {@link SteamCommunity#getUserInventory}.
    */
  trait CEconItem extends StObject {
    
    var actions: js.Array[Any]
    
    /** How much of this item is in this stack. */
    var amount: Double
    
    /** Not always present. An object containing arbitrary data as reported by the game's item server. */
    var app_data: js.UndefOr[Any] = js.undefined
    
    /** The ID of the app which owns the item. */
    var appid: typings.steamcommunity.mod.appid
    
    /** Alias of id. */
    var assetid: typings.steamcommunity.mod.assetid
    
    /** The displayed background color, in hexadecimal. */
    var background_color: String
    
    /** When does the trade ban end. */
    var cache_expiration: js.UndefOr[js.Date] = js.undefined
    
    /** The first half of the item cache identifier. The classid is enough to get you basic details about the item. */
    var classid: typings.steamcommunity.mod.classid
    
    /** true if, on the Steam Community Market, this item will use buy orders. false if not. */
    var commodity: Boolean
    
    /** The ID of the context within the app in which the item resides. */
    var contextid: typings.steamcommunity.mod.contextid
    
    var currencyid: Any
    
    /** An array of objects containing information about the item. Displayed under the item's type. */
    var descriptions: js.Array[Any]
    
    /**
      * An array of strings containing "fraud warnings" about the item.
      * In inventories and trades, items with fraud warnings have a red (!) symbol, and fraud warnings are displayed in red under the item's name.
      */
    var fraudwarnings: js.Array[Any]
    
    /**
      * Returns a URL where this item's image can be downloaded.
      */
    def getImageURL(): String
    
    /**
      * Same as getImageURL(), except for the item's large image, if present.
      */
    def getLargeImageURL(): String
    
    /**
      * Returns a specific tag from the item, or null if it doesn't exist.
      *
      * @param category A string containing the tag's category (the category property of the tag object).
      */
    def getTag(category: String): Any
    
    /** The item's unique ID within its app+context. */
    var id: String
    
    /** The second half of the item cache identifier. */
    var instanceid: typings.steamcommunity.mod.instanceid
    
    var is_currency: Boolean
    
    var market_fee_app: Double
    
    /** The item's universal market name. This identifies the item's market listing page (M4A1-S | Nightmare (Field-Tested)...). */
    var market_hash_name: String
    
    /** How many days for which the item will be unmarketable after being sold on the market. */
    var market_marketable_restriction: Double
    
    /** How many days for which the item will be untradable after being sold on the market. */
    var market_tradable_restriction: Double
    
    /** true if the item can be listed on the Steam Community Market, false if not. */
    var marketable: Boolean
    
    /** The item's display name. */
    var name: String
    
    /** The render color of the item's name, in hexadecimal. */
    var name_color: String
    
    var owner: Any
    
    /** The item's position within the inventory (starting at 1). Not defined if this item wasn't retrieved directly from an inventory (e.g. from a trade offer or inventory history). */
    var pos: Double
    
    /** An array of objects containing the item's inventory tags. */
    var tags: js.Array[Any]
    
    /** true if the item can be traded, false if not. */
    var tradable: Boolean
    
    /** The "type" that's shown under the game name to the right of the game icon (Classified Rifle, Extraordinary Collectible, Restricted Rifle...). */
    var `type`: String
  }
  object CEconItem {
    
    inline def apply(
      actions: js.Array[Any],
      amount: Double,
      appid: appid,
      assetid: assetid,
      background_color: String,
      classid: classid,
      commodity: Boolean,
      contextid: contextid,
      currencyid: Any,
      descriptions: js.Array[Any],
      fraudwarnings: js.Array[Any],
      getImageURL: () => String,
      getLargeImageURL: () => String,
      getTag: String => Any,
      id: String,
      instanceid: instanceid,
      is_currency: Boolean,
      market_fee_app: Double,
      market_hash_name: String,
      market_marketable_restriction: Double,
      market_tradable_restriction: Double,
      marketable: Boolean,
      name: String,
      name_color: String,
      owner: Any,
      pos: Double,
      tags: js.Array[Any],
      tradable: Boolean,
      `type`: String
    ): CEconItem = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], appid = appid.asInstanceOf[js.Any], assetid = assetid.asInstanceOf[js.Any], background_color = background_color.asInstanceOf[js.Any], classid = classid.asInstanceOf[js.Any], commodity = commodity.asInstanceOf[js.Any], contextid = contextid.asInstanceOf[js.Any], currencyid = currencyid.asInstanceOf[js.Any], descriptions = descriptions.asInstanceOf[js.Any], fraudwarnings = fraudwarnings.asInstanceOf[js.Any], getImageURL = js.Any.fromFunction0(getImageURL), getLargeImageURL = js.Any.fromFunction0(getLargeImageURL), getTag = js.Any.fromFunction1(getTag), id = id.asInstanceOf[js.Any], instanceid = instanceid.asInstanceOf[js.Any], is_currency = is_currency.asInstanceOf[js.Any], market_fee_app = market_fee_app.asInstanceOf[js.Any], market_hash_name = market_hash_name.asInstanceOf[js.Any], market_marketable_restriction = market_marketable_restriction.asInstanceOf[js.Any], market_tradable_restriction = market_tradable_restriction.asInstanceOf[js.Any], marketable = marketable.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], name_color = name_color.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], tradable = tradable.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CEconItem]
    }
    
    extension [Self <: CEconItem](x: Self) {
      
      inline def setActions(value: js.Array[Any]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsVarargs(value: Any*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setApp_data(value: Any): Self = StObject.set(x, "app_data", value.asInstanceOf[js.Any])
      
      inline def setApp_dataUndefined: Self = StObject.set(x, "app_data", js.undefined)
      
      inline def setAppid(value: appid): Self = StObject.set(x, "appid", value.asInstanceOf[js.Any])
      
      inline def setAssetid(value: assetid): Self = StObject.set(x, "assetid", value.asInstanceOf[js.Any])
      
      inline def setBackground_color(value: String): Self = StObject.set(x, "background_color", value.asInstanceOf[js.Any])
      
      inline def setCache_expiration(value: js.Date): Self = StObject.set(x, "cache_expiration", value.asInstanceOf[js.Any])
      
      inline def setCache_expirationUndefined: Self = StObject.set(x, "cache_expiration", js.undefined)
      
      inline def setClassid(value: classid): Self = StObject.set(x, "classid", value.asInstanceOf[js.Any])
      
      inline def setCommodity(value: Boolean): Self = StObject.set(x, "commodity", value.asInstanceOf[js.Any])
      
      inline def setContextid(value: contextid): Self = StObject.set(x, "contextid", value.asInstanceOf[js.Any])
      
      inline def setCurrencyid(value: Any): Self = StObject.set(x, "currencyid", value.asInstanceOf[js.Any])
      
      inline def setDescriptions(value: js.Array[Any]): Self = StObject.set(x, "descriptions", value.asInstanceOf[js.Any])
      
      inline def setDescriptionsVarargs(value: Any*): Self = StObject.set(x, "descriptions", js.Array(value*))
      
      inline def setFraudwarnings(value: js.Array[Any]): Self = StObject.set(x, "fraudwarnings", value.asInstanceOf[js.Any])
      
      inline def setFraudwarningsVarargs(value: Any*): Self = StObject.set(x, "fraudwarnings", js.Array(value*))
      
      inline def setGetImageURL(value: () => String): Self = StObject.set(x, "getImageURL", js.Any.fromFunction0(value))
      
      inline def setGetLargeImageURL(value: () => String): Self = StObject.set(x, "getLargeImageURL", js.Any.fromFunction0(value))
      
      inline def setGetTag(value: String => Any): Self = StObject.set(x, "getTag", js.Any.fromFunction1(value))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInstanceid(value: instanceid): Self = StObject.set(x, "instanceid", value.asInstanceOf[js.Any])
      
      inline def setIs_currency(value: Boolean): Self = StObject.set(x, "is_currency", value.asInstanceOf[js.Any])
      
      inline def setMarket_fee_app(value: Double): Self = StObject.set(x, "market_fee_app", value.asInstanceOf[js.Any])
      
      inline def setMarket_hash_name(value: String): Self = StObject.set(x, "market_hash_name", value.asInstanceOf[js.Any])
      
      inline def setMarket_marketable_restriction(value: Double): Self = StObject.set(x, "market_marketable_restriction", value.asInstanceOf[js.Any])
      
      inline def setMarket_tradable_restriction(value: Double): Self = StObject.set(x, "market_tradable_restriction", value.asInstanceOf[js.Any])
      
      inline def setMarketable(value: Boolean): Self = StObject.set(x, "marketable", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setName_color(value: String): Self = StObject.set(x, "name_color", value.asInstanceOf[js.Any])
      
      inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setTags(value: js.Array[Any]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsVarargs(value: Any*): Self = StObject.set(x, "tags", js.Array(value*))
      
      inline def setTradable(value: Boolean): Self = StObject.set(x, "tradable", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
