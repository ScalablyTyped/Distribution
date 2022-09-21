package typings.steamcommunity

import org.scalablytyped.runtime.StringDictionary
import typings.steamcommunity.mod.CallbackError
import typings.steamcommunity.mod.SteamID
import typings.steamcommunity.mod.appid
import typings.steamcommunity.steamcommunityStrings.`in-game`
import typings.steamcommunity.steamcommunityStrings.offline
import typings.steamcommunity.steamcommunityStrings.online
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AppID_ extends StObject {
    
    /** An integer appID if you want this status update to be tagged with a specific game. */
    var appID: appid
  }
  object AppID_ {
    
    inline def apply(appID: appid): AppID_ = {
      val __obj = js.Dynamic.literal(appID = appID.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppID_]
    }
    
    extension [Self <: AppID_](x: Self) {
      
      inline def setAppID(value: appid): Self = StObject.set(x, "appID", value.asInstanceOf[js.Any])
    }
  }
  
  trait Appid extends StObject {
    
    /** The AppID of the game you're searching for. */
    var appid: typings.steamcommunity.mod.appid
    
    /** The query string to search for. */
    var query: String
    
    /** `true` to also search in the descriptions of items (takes longer to search), `false` or omitted otherwise. */
    var searchDescriptions: Boolean
  }
  object Appid {
    
    inline def apply(appid: appid, query: String, searchDescriptions: Boolean): Appid = {
      val __obj = js.Dynamic.literal(appid = appid.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], searchDescriptions = searchDescriptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Appid]
    }
    
    extension [Self <: Appid](x: Self) {
      
      inline def setAppid(value: appid): Self = StObject.set(x, "appid", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setSearchDescriptions(value: Boolean): Self = StObject.set(x, "searchDescriptions", value.asInstanceOf[js.Any])
    }
  }
  
  trait Avatar extends StObject {
    
    /** A URL to the commenter's avatar. */
    var avatar: String
    
    /** The commenter's name. */
    var name: Any
    
    /** offline/online/in-game. */
    var state: offline | online | `in-game`
    
    /** A SteamID object. */
    var steamID: SteamID
  }
  object Avatar {
    
    inline def apply(avatar: String, name: Any, state: offline | online | `in-game`, steamID: SteamID): Avatar = {
      val __obj = js.Dynamic.literal(avatar = avatar.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], steamID = steamID.asInstanceOf[js.Any])
      __obj.asInstanceOf[Avatar]
    }
    
    extension [Self <: Avatar](x: Self) {
      
      inline def setAvatar(value: String): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      inline def setName(value: Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setState(value: offline | online | `in-game`): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setSteamID(value: SteamID): Self = StObject.set(x, "steamID", value.asInstanceOf[js.Any])
    }
  }
  
  trait BackgroundUrl extends StObject {
    
    /** A string containing the user's profile background URL. `null` if they have no custom background. */
    var backgroundUrl: String | Null
    
    var err: CallbackError
  }
  object BackgroundUrl {
    
    inline def apply(): BackgroundUrl = {
      val __obj = js.Dynamic.literal(backgroundUrl = null, err = null)
      __obj.asInstanceOf[BackgroundUrl]
    }
    
    extension [Self <: BackgroundUrl](x: Self) {
      
      inline def setBackgroundUrl(value: String): Self = StObject.set(x, "backgroundUrl", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUrlNull: Self = StObject.set(x, "backgroundUrl", null)
      
      inline def setErr(value: CallbackError): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      inline def setErrNull: Self = StObject.set(x, "err", null)
    }
  }
  
  trait Count extends StObject {
    
    /** How many comments you want to retrieve. */
    var count: Double
    
    /** The offset of the first comment you want to retrieve (default 0). */
    var start: Double
  }
  object Count {
    
    inline def apply(count: Double, start: Double): Count = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Count]
    }
    
    extension [Self <: Count](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Error & {[key: string] : any} */
  trait Errorkeystringany
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    /* standard es2022.error */
    var cause: js.UndefOr[Any] = js.undefined
    
    /* standard es5 */
    var message: String
    
    /* standard es5 */
    var name: String
    
    /* standard es5 */
    var stack: js.UndefOr[String] = js.undefined
  }
  object Errorkeystringany {
    
    inline def apply(message: String, name: String): Errorkeystringany = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Errorkeystringany]
    }
    
    extension [Self <: Errorkeystringany](x: Self) {
      
      inline def setCause(value: Any): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
      
      inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
  
  trait Foil extends StObject {
    
    var foil: Boolean
    
    var image: String
    
    var name: String
    
    var series: Any
  }
  object Foil {
    
    inline def apply(foil: Boolean, image: String, name: String, series: Any): Foil = {
      val __obj = js.Dynamic.literal(foil = foil.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any])
      __obj.asInstanceOf[Foil]
    }
    
    extension [Self <: Foil](x: Self) {
      
      inline def setFoil(value: Boolean): Self = StObject.set(x, "foil", value.asInstanceOf[js.Any])
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSeries(value: Any): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    }
  }
  
  trait GemValue extends StObject {
    
    // ** How many gems you'd get if you gemified this item.
    var gemValue: Double
    
    // ** A string containing the title which goes in the prompt shown in the Steam UI, e.g. "Turn into gems?".
    var promptTitle: String
  }
  object GemValue {
    
    inline def apply(gemValue: Double, promptTitle: String): GemValue = {
      val __obj = js.Dynamic.literal(gemValue = gemValue.asInstanceOf[js.Any], promptTitle = promptTitle.asInstanceOf[js.Any])
      __obj.asInstanceOf[GemValue]
    }
    
    extension [Self <: GemValue](x: Self) {
      
      inline def setGemValue(value: Double): Self = StObject.set(x, "gemValue", value.asInstanceOf[js.Any])
      
      inline def setPromptTitle(value: String): Self = StObject.set(x, "promptTitle", value.asInstanceOf[js.Any])
    }
  }
  
  trait GemsReceived extends StObject {
    
    // ** How many gems you got for this item.
    var gemsReceived: Double
    
    // ** How many gems you have now.
    var totalGems: Double
  }
  object GemsReceived {
    
    inline def apply(gemsReceived: Double, totalGems: Double): GemsReceived = {
      val __obj = js.Dynamic.literal(gemsReceived = gemsReceived.asInstanceOf[js.Any], totalGems = totalGems.asInstanceOf[js.Any])
      __obj.asInstanceOf[GemsReceived]
    }
    
    extension [Self <: GemsReceived](x: Self) {
      
      inline def setGemsReceived(value: Double): Self = StObject.set(x, "gemsReceived", value.asInstanceOf[js.Any])
      
      inline def setTotalGems(value: Double): Self = StObject.set(x, "totalGems", value.asInstanceOf[js.Any])
    }
  }
  
  trait GiftName extends StObject {
    
    // ** The name of this gift.
    var giftName: String
    
    // ** A bool indicating whether your account already owns this package (if true, you can't redeem it because you own it already).
    var owned: Boolean
    
    // ** The ID of the Steam package that you'll be granted if you redeem this gift.
    var packageID: Any
  }
  object GiftName {
    
    inline def apply(giftName: String, owned: Boolean, packageID: Any): GiftName = {
      val __obj = js.Dynamic.literal(giftName = giftName.asInstanceOf[js.Any], owned = owned.asInstanceOf[js.Any], packageID = packageID.asInstanceOf[js.Any])
      __obj.asInstanceOf[GiftName]
    }
    
    extension [Self <: GiftName](x: Self) {
      
      inline def setGiftName(value: String): Self = StObject.set(x, "giftName", value.asInstanceOf[js.Any])
      
      inline def setOwned(value: Boolean): Self = StObject.set(x, "owned", value.asInstanceOf[js.Any])
      
      inline def setPackageID(value: Any): Self = StObject.set(x, "packageID", value.asInstanceOf[js.Any])
    }
  }
  
  trait Hour extends StObject {
    
    /** A Date object representing the hour that this object contains data for. */
    var hour: js.Date
    
    /** The median price at which this item was sold during this hour (as a float). */
    var price: Double
    
    /** The amount of this item which was sold during this hour. */
    var quantity: Double
  }
  object Hour {
    
    inline def apply(hour: js.Date, price: Double, quantity: Double): Hour = {
      val __obj = js.Dynamic.literal(hour = hour.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hour]
    }
    
    extension [Self <: Hour](x: Self) {
      
      inline def setHour(value: js.Date): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      inline def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    }
  }
  
  trait Identitysecret extends StObject {
    
    /** This is your secret that's used for confirming trades. */
    var identity_secret: Any
    
    /** You will need this in the future to disable two-factor authentication. */
    var revocation_code: Any
    
    /** This is your secret that's used for two-factor authentication. */
    var shared_secret: Any
    
    /** A value from EResult. If this is not OK (1), then the request failed. */
    var status: Any
  }
  object Identitysecret {
    
    inline def apply(identity_secret: Any, revocation_code: Any, shared_secret: Any, status: Any): Identitysecret = {
      val __obj = js.Dynamic.literal(identity_secret = identity_secret.asInstanceOf[js.Any], revocation_code = revocation_code.asInstanceOf[js.Any], shared_secret = shared_secret.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Identitysecret]
    }
    
    extension [Self <: Identitysecret](x: Self) {
      
      inline def setIdentity_secret(value: Any): Self = StObject.set(x, "identity_secret", value.asInstanceOf[js.Any])
      
      inline def setRevocation_code(value: Any): Self = StObject.set(x, "revocation_code", value.asInstanceOf[js.Any])
      
      inline def setShared_secret(value: Any): Self = StObject.set(x, "shared_secret", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Any): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait Spoiler extends StObject {
    
    /** `true` to mark this as a spoiler (default `false`). */
    var spoiler: Boolean
  }
  object Spoiler {
    
    inline def apply(spoiler: Boolean): Spoiler = {
      val __obj = js.Dynamic.literal(spoiler = spoiler.asInstanceOf[js.Any])
      __obj.asInstanceOf[Spoiler]
    }
    
    extension [Self <: Spoiler](x: Self) {
      
      inline def setSpoiler(value: Boolean): Self = StObject.set(x, "spoiler", value.asInstanceOf[js.Any])
    }
  }
}
