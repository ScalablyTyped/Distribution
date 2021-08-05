package typings.socialLogos

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("social-logos", JSImport.Default)
  @js.native
  class default ()
    extends Component[Props, js.Object, js.Any]
  
  trait Props extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var icon: SocialIcon
    
    var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
  }
  object Props {
    
    inline def apply(icon: SocialIcon): Props = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setIcon(value: SocialIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.socialLogos.socialLogosStrings.amazon
    - typings.socialLogos.socialLogosStrings.behance
    - typings.socialLogos.socialLogosStrings.`blogger-alt`
    - typings.socialLogos.socialLogosStrings.blogger
    - typings.socialLogos.socialLogosStrings.codepen
    - typings.socialLogos.socialLogosStrings.dribbble
    - typings.socialLogos.socialLogosStrings.dropbox
    - typings.socialLogos.socialLogosStrings.eventbrite
    - typings.socialLogos.socialLogosStrings.facebook
    - typings.socialLogos.socialLogosStrings.feed
    - typings.socialLogos.socialLogosStrings.flickr
    - typings.socialLogos.socialLogosStrings.foursquare
    - typings.socialLogos.socialLogosStrings.ghost
    - typings.socialLogos.socialLogosStrings.github
    - typings.socialLogos.socialLogosStrings.`google-alt`
    - typings.socialLogos.socialLogosStrings.`google-plus-alt`
    - typings.socialLogos.socialLogosStrings.`google-plus`
    - typings.socialLogos.socialLogosStrings.google
    - typings.socialLogos.socialLogosStrings.instagram
    - typings.socialLogos.socialLogosStrings.linkedin
    - typings.socialLogos.socialLogosStrings.mail
    - typings.socialLogos.socialLogosStrings.medium
    - typings.socialLogos.socialLogosStrings.`pinterest-alt`
    - typings.socialLogos.socialLogosStrings.pinterest
    - typings.socialLogos.socialLogosStrings.pocket
    - typings.socialLogos.socialLogosStrings.polldaddy
    - typings.socialLogos.socialLogosStrings.print
    - typings.socialLogos.socialLogosStrings.reddit
    - typings.socialLogos.socialLogosStrings.share
    - typings.socialLogos.socialLogosStrings.skype
    - typings.socialLogos.socialLogosStrings.spotify
    - typings.socialLogos.socialLogosStrings.squarespace
    - typings.socialLogos.socialLogosStrings.stumbleupon
    - typings.socialLogos.socialLogosStrings.telegram
    - typings.socialLogos.socialLogosStrings.`tumblr-alt`
    - typings.socialLogos.socialLogosStrings.tumblr
    - typings.socialLogos.socialLogosStrings.twitch
    - typings.socialLogos.socialLogosStrings.`twitter-alt`
    - typings.socialLogos.socialLogosStrings.twitter
    - typings.socialLogos.socialLogosStrings.vimeo
    - typings.socialLogos.socialLogosStrings.whatsapp
    - typings.socialLogos.socialLogosStrings.woocommerce
    - typings.socialLogos.socialLogosStrings.wordpress
    - typings.socialLogos.socialLogosStrings.xanga
    - typings.socialLogos.socialLogosStrings.youtube
  */
  trait SocialIcon extends StObject
  object SocialIcon {
    
    inline def amazon: typings.socialLogos.socialLogosStrings.amazon = "amazon".asInstanceOf[typings.socialLogos.socialLogosStrings.amazon]
    
    inline def behance: typings.socialLogos.socialLogosStrings.behance = "behance".asInstanceOf[typings.socialLogos.socialLogosStrings.behance]
    
    inline def blogger: typings.socialLogos.socialLogosStrings.blogger = "blogger".asInstanceOf[typings.socialLogos.socialLogosStrings.blogger]
    
    inline def `blogger-alt`: typings.socialLogos.socialLogosStrings.`blogger-alt` = "blogger-alt".asInstanceOf[typings.socialLogos.socialLogosStrings.`blogger-alt`]
    
    inline def codepen: typings.socialLogos.socialLogosStrings.codepen = "codepen".asInstanceOf[typings.socialLogos.socialLogosStrings.codepen]
    
    inline def dribbble: typings.socialLogos.socialLogosStrings.dribbble = "dribbble".asInstanceOf[typings.socialLogos.socialLogosStrings.dribbble]
    
    inline def dropbox: typings.socialLogos.socialLogosStrings.dropbox = "dropbox".asInstanceOf[typings.socialLogos.socialLogosStrings.dropbox]
    
    inline def eventbrite: typings.socialLogos.socialLogosStrings.eventbrite = "eventbrite".asInstanceOf[typings.socialLogos.socialLogosStrings.eventbrite]
    
    inline def facebook: typings.socialLogos.socialLogosStrings.facebook = "facebook".asInstanceOf[typings.socialLogos.socialLogosStrings.facebook]
    
    inline def feed: typings.socialLogos.socialLogosStrings.feed = "feed".asInstanceOf[typings.socialLogos.socialLogosStrings.feed]
    
    inline def flickr: typings.socialLogos.socialLogosStrings.flickr = "flickr".asInstanceOf[typings.socialLogos.socialLogosStrings.flickr]
    
    inline def foursquare: typings.socialLogos.socialLogosStrings.foursquare = "foursquare".asInstanceOf[typings.socialLogos.socialLogosStrings.foursquare]
    
    inline def ghost: typings.socialLogos.socialLogosStrings.ghost = "ghost".asInstanceOf[typings.socialLogos.socialLogosStrings.ghost]
    
    inline def github: typings.socialLogos.socialLogosStrings.github = "github".asInstanceOf[typings.socialLogos.socialLogosStrings.github]
    
    inline def google: typings.socialLogos.socialLogosStrings.google = "google".asInstanceOf[typings.socialLogos.socialLogosStrings.google]
    
    inline def `google-alt`: typings.socialLogos.socialLogosStrings.`google-alt` = "google-alt".asInstanceOf[typings.socialLogos.socialLogosStrings.`google-alt`]
    
    inline def `google-plus`: typings.socialLogos.socialLogosStrings.`google-plus` = "google-plus".asInstanceOf[typings.socialLogos.socialLogosStrings.`google-plus`]
    
    inline def `google-plus-alt`: typings.socialLogos.socialLogosStrings.`google-plus-alt` = "google-plus-alt".asInstanceOf[typings.socialLogos.socialLogosStrings.`google-plus-alt`]
    
    inline def instagram: typings.socialLogos.socialLogosStrings.instagram = "instagram".asInstanceOf[typings.socialLogos.socialLogosStrings.instagram]
    
    inline def linkedin: typings.socialLogos.socialLogosStrings.linkedin = "linkedin".asInstanceOf[typings.socialLogos.socialLogosStrings.linkedin]
    
    inline def mail: typings.socialLogos.socialLogosStrings.mail = "mail".asInstanceOf[typings.socialLogos.socialLogosStrings.mail]
    
    inline def medium: typings.socialLogos.socialLogosStrings.medium = "medium".asInstanceOf[typings.socialLogos.socialLogosStrings.medium]
    
    inline def pinterest: typings.socialLogos.socialLogosStrings.pinterest = "pinterest".asInstanceOf[typings.socialLogos.socialLogosStrings.pinterest]
    
    inline def `pinterest-alt`: typings.socialLogos.socialLogosStrings.`pinterest-alt` = "pinterest-alt".asInstanceOf[typings.socialLogos.socialLogosStrings.`pinterest-alt`]
    
    inline def pocket: typings.socialLogos.socialLogosStrings.pocket = "pocket".asInstanceOf[typings.socialLogos.socialLogosStrings.pocket]
    
    inline def polldaddy: typings.socialLogos.socialLogosStrings.polldaddy = "polldaddy".asInstanceOf[typings.socialLogos.socialLogosStrings.polldaddy]
    
    inline def print: typings.socialLogos.socialLogosStrings.print = "print".asInstanceOf[typings.socialLogos.socialLogosStrings.print]
    
    inline def reddit: typings.socialLogos.socialLogosStrings.reddit = "reddit".asInstanceOf[typings.socialLogos.socialLogosStrings.reddit]
    
    inline def share: typings.socialLogos.socialLogosStrings.share = "share".asInstanceOf[typings.socialLogos.socialLogosStrings.share]
    
    inline def skype: typings.socialLogos.socialLogosStrings.skype = "skype".asInstanceOf[typings.socialLogos.socialLogosStrings.skype]
    
    inline def spotify: typings.socialLogos.socialLogosStrings.spotify = "spotify".asInstanceOf[typings.socialLogos.socialLogosStrings.spotify]
    
    inline def squarespace: typings.socialLogos.socialLogosStrings.squarespace = "squarespace".asInstanceOf[typings.socialLogos.socialLogosStrings.squarespace]
    
    inline def stumbleupon: typings.socialLogos.socialLogosStrings.stumbleupon = "stumbleupon".asInstanceOf[typings.socialLogos.socialLogosStrings.stumbleupon]
    
    inline def telegram: typings.socialLogos.socialLogosStrings.telegram = "telegram".asInstanceOf[typings.socialLogos.socialLogosStrings.telegram]
    
    inline def tumblr: typings.socialLogos.socialLogosStrings.tumblr = "tumblr".asInstanceOf[typings.socialLogos.socialLogosStrings.tumblr]
    
    inline def `tumblr-alt`: typings.socialLogos.socialLogosStrings.`tumblr-alt` = "tumblr-alt".asInstanceOf[typings.socialLogos.socialLogosStrings.`tumblr-alt`]
    
    inline def twitch: typings.socialLogos.socialLogosStrings.twitch = "twitch".asInstanceOf[typings.socialLogos.socialLogosStrings.twitch]
    
    inline def twitter: typings.socialLogos.socialLogosStrings.twitter = "twitter".asInstanceOf[typings.socialLogos.socialLogosStrings.twitter]
    
    inline def `twitter-alt`: typings.socialLogos.socialLogosStrings.`twitter-alt` = "twitter-alt".asInstanceOf[typings.socialLogos.socialLogosStrings.`twitter-alt`]
    
    inline def vimeo: typings.socialLogos.socialLogosStrings.vimeo = "vimeo".asInstanceOf[typings.socialLogos.socialLogosStrings.vimeo]
    
    inline def whatsapp: typings.socialLogos.socialLogosStrings.whatsapp = "whatsapp".asInstanceOf[typings.socialLogos.socialLogosStrings.whatsapp]
    
    inline def woocommerce: typings.socialLogos.socialLogosStrings.woocommerce = "woocommerce".asInstanceOf[typings.socialLogos.socialLogosStrings.woocommerce]
    
    inline def wordpress: typings.socialLogos.socialLogosStrings.wordpress = "wordpress".asInstanceOf[typings.socialLogos.socialLogosStrings.wordpress]
    
    inline def xanga: typings.socialLogos.socialLogosStrings.xanga = "xanga".asInstanceOf[typings.socialLogos.socialLogosStrings.xanga]
    
    inline def youtube: typings.socialLogos.socialLogosStrings.youtube = "youtube".asInstanceOf[typings.socialLogos.socialLogosStrings.youtube]
  }
  
  type SocialLogo = Component[Props, js.Object, js.Any]
}
