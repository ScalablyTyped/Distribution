package typings.reactNativeElements

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.anon.PickSocialIconPropsPartia
import typings.reactNativeElements.anon.SocialIconPropsPartialThe
import typings.reactNativeElements.anon.TypeofComponent
import typings.reactNativeElements.helpersMod.RneFunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object socialIconMod extends Shortcut {
  
  @JSImport("react-native-elements/dist/social/SocialIcon", JSImport.Default)
  @js.native
  val default: FunctionComponent[PickSocialIconPropsPartia] | ForwardRefExoticComponent[SocialIconPropsPartialThe] = js.native
  
  @JSImport("react-native-elements/dist/social/SocialIcon", "SocialIcon")
  @js.native
  val SocialIcon: RneFunctionComponent[SocialIconProps] = js.native
  
  trait SocialIconProps extends StObject {
    
    var Component: js.UndefOr[
        TypeofComponent & (Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
          typings.react.mod.Component[js.Object, js.Object, js.Object]
        ])
      ] = js.undefined
    
    var activityIndicatorStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var button: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var fontFamily: js.UndefOr[String] = js.undefined
    
    var fontStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var fontWeight: js.UndefOr[String] = js.undefined
    
    var iconColor: js.UndefOr[String] = js.undefined
    
    var iconSize: js.UndefOr[Double] = js.undefined
    
    var iconStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var iconType: js.UndefOr[String] = js.undefined
    
    var light: js.UndefOr[Boolean] = js.undefined
    
    var loading: js.UndefOr[Boolean] = js.undefined
    
    var onLongPress: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var raised: js.UndefOr[Boolean] = js.undefined
    
    var small: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[SocialMediaType] = js.undefined
    
    var underlayColor: js.UndefOr[String] = js.undefined
  }
  object SocialIconProps {
    
    inline def apply(): SocialIconProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SocialIconProps]
    }
    
    extension [Self <: SocialIconProps](x: Self) {
      
      inline def setActivityIndicatorStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "activityIndicatorStyle", value.asInstanceOf[js.Any])
      
      inline def setActivityIndicatorStyleNull: Self = StObject.set(x, "activityIndicatorStyle", null)
      
      inline def setActivityIndicatorStyleUndefined: Self = StObject.set(x, "activityIndicatorStyle", js.undefined)
      
      inline def setButton(value: Boolean): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      inline def setComponent(
        value: TypeofComponent & (Instantiable1[
              /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
              Component[js.Object, js.Object, js.Object]
            ])
      ): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "Component", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleNull: Self = StObject.set(x, "fontStyle", null)
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setIconColor(value: String): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
      
      inline def setIconColorUndefined: Self = StObject.set(x, "iconColor", js.undefined)
      
      inline def setIconSize(value: Double): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
      
      inline def setIconSizeUndefined: Self = StObject.set(x, "iconSize", js.undefined)
      
      inline def setIconStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
      
      inline def setIconStyleNull: Self = StObject.set(x, "iconStyle", null)
      
      inline def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
      
      inline def setIconType(value: String): Self = StObject.set(x, "iconType", value.asInstanceOf[js.Any])
      
      inline def setIconTypeUndefined: Self = StObject.set(x, "iconType", js.undefined)
      
      inline def setLight(value: Boolean): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
      
      inline def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setOnLongPress(value: () => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction0(value))
      
      inline def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
      
      inline def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      inline def setRaised(value: Boolean): Self = StObject.set(x, "raised", value.asInstanceOf[js.Any])
      
      inline def setRaisedUndefined: Self = StObject.set(x, "raised", js.undefined)
      
      inline def setSmall(value: String): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
      
      inline def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: SocialMediaType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUnderlayColor(value: String): Self = StObject.set(x, "underlayColor", value.asInstanceOf[js.Any])
      
      inline def setUnderlayColorUndefined: Self = StObject.set(x, "underlayColor", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeElements.reactNativeElementsStrings.facebook
    - typings.reactNativeElements.reactNativeElementsStrings.`facebook-messenger`
    - typings.reactNativeElements.reactNativeElementsStrings.whatsapp
    - typings.reactNativeElements.reactNativeElementsStrings.twitter
    - typings.reactNativeElements.reactNativeElementsStrings.`google-plus-official`
    - typings.reactNativeElements.reactNativeElementsStrings.google
    - typings.reactNativeElements.reactNativeElementsStrings.pinterest
    - typings.reactNativeElements.reactNativeElementsStrings.linkedin
    - typings.reactNativeElements.reactNativeElementsStrings.youtube
    - typings.reactNativeElements.reactNativeElementsStrings.vimeo
    - typings.reactNativeElements.reactNativeElementsStrings.tumblr
    - typings.reactNativeElements.reactNativeElementsStrings.instagram
    - typings.reactNativeElements.reactNativeElementsStrings.quora
    - typings.reactNativeElements.reactNativeElementsStrings.flickr
    - typings.reactNativeElements.reactNativeElementsStrings.foursquare
    - typings.reactNativeElements.reactNativeElementsStrings.wordpress
    - typings.reactNativeElements.reactNativeElementsStrings.stumbleupon
    - typings.reactNativeElements.reactNativeElementsStrings.github
    - typings.reactNativeElements.reactNativeElementsStrings.`github-alt`
    - typings.reactNativeElements.reactNativeElementsStrings.twitch
    - typings.reactNativeElements.reactNativeElementsStrings.medium
    - typings.reactNativeElements.reactNativeElementsStrings.soundcloud
    - typings.reactNativeElements.reactNativeElementsStrings.`stack-overflow`
    - typings.reactNativeElements.reactNativeElementsStrings.gitlab
    - typings.reactNativeElements.reactNativeElementsStrings.angellist
    - typings.reactNativeElements.reactNativeElementsStrings.codepen
    - typings.reactNativeElements.reactNativeElementsStrings.weibo
    - typings.reactNativeElements.reactNativeElementsStrings.vk
  */
  trait SocialMediaType extends StObject
  object SocialMediaType {
    
    inline def angellist: typings.reactNativeElements.reactNativeElementsStrings.angellist = "angellist".asInstanceOf[typings.reactNativeElements.reactNativeElementsStrings.angellist]
    
    inline def codepen: typings.reactNativeElements.reactNativeElementsStrings.codepen = "codepen".asInstanceOf[typings.reactNativeElements.reactNativeElementsStrings.codepen]
    
    inline def facebook: typings.reactNativeElements.reactNativeElementsStrings.facebook = "facebook".asInstanceOf[typings.reactNativeElements.reactNativeElementsStrings.facebook]
    
    inline def `facebook-messenger`: typings.reactNativeElements.reactNativeElementsStrings.`facebook-messenger` = "facebook-messenger".asInstanceOf[typings.reactNativeElements.reactNativeElementsStrings.`facebook-messenger`]
    
    inline def flickr: typings.reactNativeElements.reactNativeElementsStrings.flickr = "flickr".asInstanceOf[typings.reactNativeElements.reactNativeElementsStrings.flickr]
    
    inline def foursquare: typings.reactNativeElements.reactNativeElementsStrings.foursquare = "foursquare".asInstanceOf[typings.reactNativeElements.reactNativeElementsStrings.foursquare]
    
    inline def github: typings.reactNativeElements.reactNativeElementsStrings.github = "github".asInstanceOf[typings.reactNativeElements.reactNativeElementsStrings.github]
    
    inline def `github-alt`: typings.reactNativeElements.reactNativeElementsStrings.`github-alt` = "github-alt".asInstanceOf[typings.reactNativeElements.reactNativeElementsStrings.`github-alt`]
    
    inline def gitlab: typings.reactNativeElements.reactNativeElementsStrings.gitlab = "gitlab".asInstanceOf[typings.reactNativeElements.reactNativeElementsStrings.gitlab]
    
    inline def google: typings.reactNativeElements.reactNativeElementsStrings.google = "google".asInstanceOf[typings.reactNativeElements.reactNativeElementsStrings.google]
    
    inline def `google-plus-official`: typings.reactNativeElements.reactNativeElementsStrings.`google-plus-official` = "google-plus-official".asInstanceOf[typings.reactNativeElements.reactNativeElementsStrings.`google-plus-official`]
    
    inline def instagram: typings.reactNativeElements.reactNativeElementsStrings.instagram = "instagram".asInstanceOf[typings.reactNativeElements.reactNativeElementsStrings.instagram]
    
    inline def linkedin: typings.reactNativeElements.reactNativeElementsStrings.linkedin = "linkedin".asInstanceOf[typings.reactNativeElements.reactNativeElementsStrings.linkedin]
    
    inline def medium: typings.reactNativeElements.reactNativeElementsStrings.medium = "medium".asInstanceOf[typings.reactNativeElements.reactNativeElementsStrings.medium]
    
    inline def pinterest: typings.reactNativeElements.reactNativeElementsStrings.pinterest = "pinterest".asInstanceOf[typings.reactNativeElements.reactNativeElementsStrings.pinterest]
    
    inline def quora: typings.reactNativeElements.reactNativeElementsStrings.quora = "quora".asInstanceOf[typings.reactNativeElements.reactNativeElementsStrings.quora]
    
    inline def soundcloud: typings.reactNativeElements.reactNativeElementsStrings.soundcloud = "soundcloud".asInstanceOf[typings.reactNativeElements.reactNativeElementsStrings.soundcloud]
    
    inline def `stack-overflow`: typings.reactNativeElements.reactNativeElementsStrings.`stack-overflow` = "stack-overflow".asInstanceOf[typings.reactNativeElements.reactNativeElementsStrings.`stack-overflow`]
    
    inline def stumbleupon: typings.reactNativeElements.reactNativeElementsStrings.stumbleupon = "stumbleupon".asInstanceOf[typings.reactNativeElements.reactNativeElementsStrings.stumbleupon]
    
    inline def tumblr: typings.reactNativeElements.reactNativeElementsStrings.tumblr = "tumblr".asInstanceOf[typings.reactNativeElements.reactNativeElementsStrings.tumblr]
    
    inline def twitch: typings.reactNativeElements.reactNativeElementsStrings.twitch = "twitch".asInstanceOf[typings.reactNativeElements.reactNativeElementsStrings.twitch]
    
    inline def twitter: typings.reactNativeElements.reactNativeElementsStrings.twitter = "twitter".asInstanceOf[typings.reactNativeElements.reactNativeElementsStrings.twitter]
    
    inline def vimeo: typings.reactNativeElements.reactNativeElementsStrings.vimeo = "vimeo".asInstanceOf[typings.reactNativeElements.reactNativeElementsStrings.vimeo]
    
    inline def vk: typings.reactNativeElements.reactNativeElementsStrings.vk = "vk".asInstanceOf[typings.reactNativeElements.reactNativeElementsStrings.vk]
    
    inline def weibo: typings.reactNativeElements.reactNativeElementsStrings.weibo = "weibo".asInstanceOf[typings.reactNativeElements.reactNativeElementsStrings.weibo]
    
    inline def whatsapp: typings.reactNativeElements.reactNativeElementsStrings.whatsapp = "whatsapp".asInstanceOf[typings.reactNativeElements.reactNativeElementsStrings.whatsapp]
    
    inline def wordpress: typings.reactNativeElements.reactNativeElementsStrings.wordpress = "wordpress".asInstanceOf[typings.reactNativeElements.reactNativeElementsStrings.wordpress]
    
    inline def youtube: typings.reactNativeElements.reactNativeElementsStrings.youtube = "youtube".asInstanceOf[typings.reactNativeElements.reactNativeElementsStrings.youtube]
  }
  
  type _To = FunctionComponent[PickSocialIconPropsPartia] | ForwardRefExoticComponent[SocialIconPropsPartialThe]
  
  /* This means you don't have to write `default`, but can instead just say `socialIconMod.foo` */
  override def _to: FunctionComponent[PickSocialIconPropsPartia] | ForwardRefExoticComponent[SocialIconPropsPartialThe] = default
}
