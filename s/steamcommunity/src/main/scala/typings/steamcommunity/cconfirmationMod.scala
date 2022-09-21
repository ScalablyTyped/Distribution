package typings.steamcommunity

import typings.steamcommunity.mod.Callback
import typings.steamcommunity.mod.ConfirmationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cconfirmationMod {
  
  inline def apply(community: Any, data: js.Object): Unit = (^.asInstanceOf[js.Dynamic].apply(community.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("steamcommunity/classes/CConfirmation", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with CConfirmation {
    def this(community: Any, data: js.Object) = this()
    
    /** The ID of the thing that created this confirmation (trade offer ID for a trade, market listing ID for a market listing). */
    /* CompleteClass */
    var creator: String = js.native
    
    /**
      * Gets the ID of the trade offer that this confirmation is confirming, if it's for a trade.
      *
      * @param time The Unix timestamp with which the following key was generated.
      * @param key The confirmation key that was generated using the preceeding time and the tag "details" (this key can be reused). You can use steam-totp to generate this.
      * @param callback Called when the request completes.
      */
    /* CompleteClass */
    override def getOfferID(time: Any, key: Any, callback: Any): Unit = js.native
    
    /** The URL to your trading partner's avatar, if this is a trade. The URL to the image of the item, if this is a market listing. Otherwise, an empty string. */
    /* CompleteClass */
    var icon: String = js.native
    
    /** The ID of this confirmation. This is not the same as a trade offer ID. */
    /* CompleteClass */
    var id: Any = js.native
    
    /** The key for this confirmation. This is required when confirming or canceling the confirmation. This is not the same as the TOTP confirmation key. */
    /* CompleteClass */
    var key: String = js.native
    
    /* CompleteClass */
    var offerID: String | Null = js.native
    
    /**
      * A textual description of what you will receive from this confirmation, if this is a trade.
      * If this is a market listing, then this is a string containing the list price and then the amount you will receive parenthetically.
      * For example: $115.00 ($100.00)
      */
    /* CompleteClass */
    var receiving: String = js.native
    
    /**
      * Accept or decline the confirmation.
      *
      * @param time The Unix timestamp with which the following key was generated.
      * @param key The confirmation key that was generated using the preceeding time and the tag "allow" (if accepting) or "cancel" (if declining). You can use steam-totp to generate this..
      * @param accept `true` if you are accepting, `false` if you are canceling.
      * @param callback
      */
    /* CompleteClass */
    override def respond(time: Any, key: Any, accept: Boolean, callback: Callback): Unit = js.native
    
    /** A textual description of when this confirmation was created. */
    /* CompleteClass */
    var time: String = js.native
    
    /** The title of this confirmation. */
    /* CompleteClass */
    var title: String = js.native
    
    /** What type of thing this confirmation wants to confirm. The enum is available as a property of SteamCommunity. */
    /* CompleteClass */
    var `type`: ConfirmationType = js.native
  }
  @JSImport("steamcommunity/classes/CConfirmation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait CConfirmation extends StObject {
    
    /** The ID of the thing that created this confirmation (trade offer ID for a trade, market listing ID for a market listing). */
    var creator: String
    
    /**
      * Gets the ID of the trade offer that this confirmation is confirming, if it's for a trade.
      *
      * @param time The Unix timestamp with which the following key was generated.
      * @param key The confirmation key that was generated using the preceeding time and the tag "details" (this key can be reused). You can use steam-totp to generate this.
      * @param callback Called when the request completes.
      */
    def getOfferID(time: Any, key: Any, callback: Any): Unit
    
    /** The URL to your trading partner's avatar, if this is a trade. The URL to the image of the item, if this is a market listing. Otherwise, an empty string. */
    var icon: String
    
    /** The ID of this confirmation. This is not the same as a trade offer ID. */
    var id: Any
    
    /** The key for this confirmation. This is required when confirming or canceling the confirmation. This is not the same as the TOTP confirmation key. */
    var key: String
    
    var offerID: String | Null
    
    /**
      * A textual description of what you will receive from this confirmation, if this is a trade.
      * If this is a market listing, then this is a string containing the list price and then the amount you will receive parenthetically.
      * For example: $115.00 ($100.00)
      */
    var receiving: String
    
    /**
      * Accept or decline the confirmation.
      *
      * @param time The Unix timestamp with which the following key was generated.
      * @param key The confirmation key that was generated using the preceeding time and the tag "allow" (if accepting) or "cancel" (if declining). You can use steam-totp to generate this..
      * @param accept `true` if you are accepting, `false` if you are canceling.
      * @param callback
      */
    def respond(time: Any, key: Any, accept: Boolean, callback: Callback): Unit
    
    /** A textual description of when this confirmation was created. */
    var time: String
    
    /** The title of this confirmation. */
    var title: String
    
    /** What type of thing this confirmation wants to confirm. The enum is available as a property of SteamCommunity. */
    var `type`: ConfirmationType
  }
  object CConfirmation {
    
    inline def apply(
      creator: String,
      getOfferID: (Any, Any, Any) => Unit,
      icon: String,
      id: Any,
      key: String,
      receiving: String,
      respond: (Any, Any, Boolean, Callback) => Unit,
      time: String,
      title: String,
      `type`: ConfirmationType
    ): CConfirmation = {
      val __obj = js.Dynamic.literal(creator = creator.asInstanceOf[js.Any], getOfferID = js.Any.fromFunction3(getOfferID), icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], receiving = receiving.asInstanceOf[js.Any], respond = js.Any.fromFunction4(respond), time = time.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], offerID = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CConfirmation]
    }
    
    extension [Self <: CConfirmation](x: Self) {
      
      inline def setCreator(value: String): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
      
      inline def setGetOfferID(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "getOfferID", js.Any.fromFunction3(value))
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setOfferID(value: String): Self = StObject.set(x, "offerID", value.asInstanceOf[js.Any])
      
      inline def setOfferIDNull: Self = StObject.set(x, "offerID", null)
      
      inline def setReceiving(value: String): Self = StObject.set(x, "receiving", value.asInstanceOf[js.Any])
      
      inline def setRespond(value: (Any, Any, Boolean, Callback) => Unit): Self = StObject.set(x, "respond", js.Any.fromFunction4(value))
      
      inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setType(value: ConfirmationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
