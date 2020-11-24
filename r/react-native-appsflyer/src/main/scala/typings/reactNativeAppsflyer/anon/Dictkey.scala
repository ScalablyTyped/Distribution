package typings.reactNativeAppsflyer.anon

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeAppsflyer.reactNativeAppsflyerStrings.Organic
import typings.reactNativeAppsflyer.reactNativeAppsflyerStrings.`Non-organic`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dictkey
  extends /* key */ StringDictionary[js.Any] {
  
  var af_referrer_customer_id: js.UndefOr[String] = js.native
  
  var af_referrer_uid: js.UndefOr[String] = js.native
  
  var af_status: Organic | `Non-organic` = js.native
  
  var is_first_launch: Boolean = js.native
  
  var media_source: String = js.native
}
object Dictkey {
  
  @scala.inline
  def apply(af_status: Organic | `Non-organic`, is_first_launch: Boolean, media_source: String): Dictkey = {
    val __obj = js.Dynamic.literal(af_status = af_status.asInstanceOf[js.Any], is_first_launch = is_first_launch.asInstanceOf[js.Any], media_source = media_source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
  
  @scala.inline
  implicit class DictkeyOps[Self <: Dictkey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAf_status(value: Organic | `Non-organic`): Self = this.set("af_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_first_launch(value: Boolean): Self = this.set("is_first_launch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia_source(value: String): Self = this.set("media_source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAf_referrer_customer_id(value: String): Self = this.set("af_referrer_customer_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAf_referrer_customer_id: Self = this.set("af_referrer_customer_id", js.undefined)
    
    @scala.inline
    def setAf_referrer_uid(value: String): Self = this.set("af_referrer_uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAf_referrer_uid: Self = this.set("af_referrer_uid", js.undefined)
  }
}
