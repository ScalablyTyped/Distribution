package typings.reactNativeAppsflyer

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeAppsflyer.reactNativeAppsflyerStrings.Organic
import typings.reactNativeAppsflyer.reactNativeAppsflyerStrings.`Non-organic`
import typings.reactNativeAppsflyer.reactNativeAppsflyerStrings.`false`
import typings.reactNativeAppsflyer.reactNativeAppsflyerStrings.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Afadset
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var af_adset: js.UndefOr[String] = js.undefined
    
    var af_channel: js.UndefOr[String] = js.undefined
    
    var af_click_lookback: String
    
    var af_cost_currency: js.UndefOr[String] = js.undefined
    
    var af_dp: js.UndefOr[String] = js.undefined
    
    // Uri-Scheme
    var af_sub1: js.UndefOr[String] = js.undefined
    
    var af_sub2: js.UndefOr[String] = js.undefined
    
    var af_sub3: js.UndefOr[String] = js.undefined
    
    var af_sub4: js.UndefOr[String] = js.undefined
    
    var af_sub5: js.UndefOr[String] = js.undefined
    
    var c: js.UndefOr[String] = js.undefined
    
    var campaign: String
    
    var deep_link_sub1: js.UndefOr[String] = js.undefined
    
    var deep_link_value: String
    
    // Uri-Scheme
    var host: js.UndefOr[String] = js.undefined
    
    var is_retargeting: js.UndefOr[String] = js.undefined
    
    var link: String
    
    var media_source: String
    
    var path: js.UndefOr[String] = js.undefined
    
    var pid: js.UndefOr[String] = js.undefined
    
    // Uri-Scheme
    var scheme: js.UndefOr[String] = js.undefined
    
    // Uri-Scheme
    var shortlink: js.UndefOr[String] = js.undefined
  }
  object Afadset {
    
    inline def apply(
      af_click_lookback: String,
      campaign: String,
      deep_link_value: String,
      link: String,
      media_source: String
    ): Afadset = {
      val __obj = js.Dynamic.literal(af_click_lookback = af_click_lookback.asInstanceOf[js.Any], campaign = campaign.asInstanceOf[js.Any], deep_link_value = deep_link_value.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], media_source = media_source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Afadset]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Afadset] (val x: Self) extends AnyVal {
      
      inline def setAf_adset(value: String): Self = StObject.set(x, "af_adset", value.asInstanceOf[js.Any])
      
      inline def setAf_adsetUndefined: Self = StObject.set(x, "af_adset", js.undefined)
      
      inline def setAf_channel(value: String): Self = StObject.set(x, "af_channel", value.asInstanceOf[js.Any])
      
      inline def setAf_channelUndefined: Self = StObject.set(x, "af_channel", js.undefined)
      
      inline def setAf_click_lookback(value: String): Self = StObject.set(x, "af_click_lookback", value.asInstanceOf[js.Any])
      
      inline def setAf_cost_currency(value: String): Self = StObject.set(x, "af_cost_currency", value.asInstanceOf[js.Any])
      
      inline def setAf_cost_currencyUndefined: Self = StObject.set(x, "af_cost_currency", js.undefined)
      
      inline def setAf_dp(value: String): Self = StObject.set(x, "af_dp", value.asInstanceOf[js.Any])
      
      inline def setAf_dpUndefined: Self = StObject.set(x, "af_dp", js.undefined)
      
      inline def setAf_sub1(value: String): Self = StObject.set(x, "af_sub1", value.asInstanceOf[js.Any])
      
      inline def setAf_sub1Undefined: Self = StObject.set(x, "af_sub1", js.undefined)
      
      inline def setAf_sub2(value: String): Self = StObject.set(x, "af_sub2", value.asInstanceOf[js.Any])
      
      inline def setAf_sub2Undefined: Self = StObject.set(x, "af_sub2", js.undefined)
      
      inline def setAf_sub3(value: String): Self = StObject.set(x, "af_sub3", value.asInstanceOf[js.Any])
      
      inline def setAf_sub3Undefined: Self = StObject.set(x, "af_sub3", js.undefined)
      
      inline def setAf_sub4(value: String): Self = StObject.set(x, "af_sub4", value.asInstanceOf[js.Any])
      
      inline def setAf_sub4Undefined: Self = StObject.set(x, "af_sub4", js.undefined)
      
      inline def setAf_sub5(value: String): Self = StObject.set(x, "af_sub5", value.asInstanceOf[js.Any])
      
      inline def setAf_sub5Undefined: Self = StObject.set(x, "af_sub5", js.undefined)
      
      inline def setC(value: String): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      inline def setCUndefined: Self = StObject.set(x, "c", js.undefined)
      
      inline def setCampaign(value: String): Self = StObject.set(x, "campaign", value.asInstanceOf[js.Any])
      
      inline def setDeep_link_sub1(value: String): Self = StObject.set(x, "deep_link_sub1", value.asInstanceOf[js.Any])
      
      inline def setDeep_link_sub1Undefined: Self = StObject.set(x, "deep_link_sub1", js.undefined)
      
      inline def setDeep_link_value(value: String): Self = StObject.set(x, "deep_link_value", value.asInstanceOf[js.Any])
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setIs_retargeting(value: String): Self = StObject.set(x, "is_retargeting", value.asInstanceOf[js.Any])
      
      inline def setIs_retargetingUndefined: Self = StObject.set(x, "is_retargeting", js.undefined)
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setMedia_source(value: String): Self = StObject.set(x, "media_source", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPid(value: String): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      inline def setPidUndefined: Self = StObject.set(x, "pid", js.undefined)
      
      inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
      
      inline def setShortlink(value: String): Self = StObject.set(x, "shortlink", value.asInstanceOf[js.Any])
      
      inline def setShortlinkUndefined: Self = StObject.set(x, "shortlink", js.undefined)
    }
  }
  
  trait Afsub1
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var af_sub1: js.UndefOr[String] = js.undefined
    
    var af_sub2: js.UndefOr[String] = js.undefined
    
    var af_sub3: js.UndefOr[String] = js.undefined
    
    var af_sub4: js.UndefOr[String] = js.undefined
    
    var af_sub5: js.UndefOr[String] = js.undefined
    
    var campaign: String
    
    var deep_link_sub1: js.UndefOr[String] = js.undefined
    
    var deep_link_value: String
    
    var media_source: String
    
    var pid: js.UndefOr[String] = js.undefined
  }
  object Afsub1 {
    
    inline def apply(campaign: String, deep_link_value: String, media_source: String): Afsub1 = {
      val __obj = js.Dynamic.literal(campaign = campaign.asInstanceOf[js.Any], deep_link_value = deep_link_value.asInstanceOf[js.Any], media_source = media_source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Afsub1]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Afsub1] (val x: Self) extends AnyVal {
      
      inline def setAf_sub1(value: String): Self = StObject.set(x, "af_sub1", value.asInstanceOf[js.Any])
      
      inline def setAf_sub1Undefined: Self = StObject.set(x, "af_sub1", js.undefined)
      
      inline def setAf_sub2(value: String): Self = StObject.set(x, "af_sub2", value.asInstanceOf[js.Any])
      
      inline def setAf_sub2Undefined: Self = StObject.set(x, "af_sub2", js.undefined)
      
      inline def setAf_sub3(value: String): Self = StObject.set(x, "af_sub3", value.asInstanceOf[js.Any])
      
      inline def setAf_sub3Undefined: Self = StObject.set(x, "af_sub3", js.undefined)
      
      inline def setAf_sub4(value: String): Self = StObject.set(x, "af_sub4", value.asInstanceOf[js.Any])
      
      inline def setAf_sub4Undefined: Self = StObject.set(x, "af_sub4", js.undefined)
      
      inline def setAf_sub5(value: String): Self = StObject.set(x, "af_sub5", value.asInstanceOf[js.Any])
      
      inline def setAf_sub5Undefined: Self = StObject.set(x, "af_sub5", js.undefined)
      
      inline def setCampaign(value: String): Self = StObject.set(x, "campaign", value.asInstanceOf[js.Any])
      
      inline def setDeep_link_sub1(value: String): Self = StObject.set(x, "deep_link_sub1", value.asInstanceOf[js.Any])
      
      inline def setDeep_link_sub1Undefined: Self = StObject.set(x, "deep_link_sub1", js.undefined)
      
      inline def setDeep_link_value(value: String): Self = StObject.set(x, "deep_link_value", value.asInstanceOf[js.Any])
      
      inline def setMedia_source(value: String): Self = StObject.set(x, "media_source", value.asInstanceOf[js.Any])
      
      inline def setPid(value: String): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      inline def setPidUndefined: Self = StObject.set(x, "pid", js.undefined)
    }
  }
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var af_status: Organic | `Non-organic`
    
    var campaign: String
    
    var is_first_launch: `true` | `false`
    
    var media_source: String
  }
  object Dictkey {
    
    inline def apply(
      af_status: Organic | `Non-organic`,
      campaign: String,
      is_first_launch: `true` | `false`,
      media_source: String
    ): Dictkey = {
      val __obj = js.Dynamic.literal(af_status = af_status.asInstanceOf[js.Any], campaign = campaign.asInstanceOf[js.Any], is_first_launch = is_first_launch.asInstanceOf[js.Any], media_source = media_source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      inline def setAf_status(value: Organic | `Non-organic`): Self = StObject.set(x, "af_status", value.asInstanceOf[js.Any])
      
      inline def setCampaign(value: String): Self = StObject.set(x, "campaign", value.asInstanceOf[js.Any])
      
      inline def setIs_first_launch(value: `true` | `false`): Self = StObject.set(x, "is_first_launch", value.asInstanceOf[js.Any])
      
      inline def setMedia_source(value: String): Self = StObject.set(x, "media_source", value.asInstanceOf[js.Any])
    }
  }
}
