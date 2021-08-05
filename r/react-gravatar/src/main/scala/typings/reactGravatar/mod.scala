package typings.reactGravatar

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * React component for rendering a gravatar profile image. Adjusts automatically to HiDPI displays.
    */
  @JSImport("react-gravatar", JSImport.Namespace)
  @js.native
  class ^ () extends Gravatar
  
  /* static member */
  @JSImport("react-gravatar", "defaultProps")
  @js.native
  val defaultProps: Props = js.native
  
  /* static member */
  @JSImport("react-gravatar", "displayName")
  @js.native
  val displayName: String = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactGravatar.reactGravatarStrings.`404`
    - typings.reactGravatar.reactGravatarStrings.mm
    - typings.reactGravatar.reactGravatarStrings.identicon
    - typings.reactGravatar.reactGravatarStrings.monsterid
    - typings.reactGravatar.reactGravatarStrings.wavatar
    - typings.reactGravatar.reactGravatarStrings.retro
    - typings.reactGravatar.reactGravatarStrings.blank
  */
  trait DefaultImage extends StObject
  object DefaultImage {
    
    inline def `404`: typings.reactGravatar.reactGravatarStrings.`404` = "404".asInstanceOf[typings.reactGravatar.reactGravatarStrings.`404`]
    
    inline def blank: typings.reactGravatar.reactGravatarStrings.blank = "blank".asInstanceOf[typings.reactGravatar.reactGravatarStrings.blank]
    
    inline def identicon: typings.reactGravatar.reactGravatarStrings.identicon = "identicon".asInstanceOf[typings.reactGravatar.reactGravatarStrings.identicon]
    
    inline def mm: typings.reactGravatar.reactGravatarStrings.mm = "mm".asInstanceOf[typings.reactGravatar.reactGravatarStrings.mm]
    
    inline def monsterid: typings.reactGravatar.reactGravatarStrings.monsterid = "monsterid".asInstanceOf[typings.reactGravatar.reactGravatarStrings.monsterid]
    
    inline def retro: typings.reactGravatar.reactGravatarStrings.retro = "retro".asInstanceOf[typings.reactGravatar.reactGravatarStrings.retro]
    
    inline def wavatar: typings.reactGravatar.reactGravatarStrings.wavatar = "wavatar".asInstanceOf[typings.reactGravatar.reactGravatarStrings.wavatar]
  }
  
  /**
    * React component for rendering a gravatar profile image. Adjusts automatically to HiDPI displays.
    */
  @js.native
  trait Gravatar
    extends Component[Props, js.Object, js.Any]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof react.react.DetailedHTMLProps<react.react.ImgHTMLAttributes<std.HTMLImageElement>, std.HTMLImageElement> ]:? react.react.DetailedHTMLProps<react.react.ImgHTMLAttributes<std.HTMLImageElement>, std.HTMLImageElement>[P]} */ trait Props extends StObject {
    
    /**
      * Gravatar has a number of built in options which you can use as defaults when an email address has no
      * matching Gravatar image.
      *
      * @default "retro"
      * @see https://gravatar.com/site/implement/images/#default-image
      */
    var default: js.UndefOr[DefaultImage] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * The email address used to look up the Gravatar image.
      * If you wish to avoid sending an email address to the client, you can compute the md5 hash on the server and
      * pass the hash to the component using the `md5` prop instead of the `email` prop.
      */
    var email: js.UndefOr[String] = js.undefined
    
    /**
      * The md5 hash of the email address used to look up the Gravatar image.
      * If you wish to avoid sending an email address to the client, you can compute the md5 hash on the server and
      * pass the hash to the component using the `md5` prop instead of the `email` prop.
      */
    var md5: js.UndefOr[String] = js.undefined
    
    /**
      * The protocol used to fetch the Gravatar image. Should be one of `http://`, `https://` or `//` (default).
      *
      * @default "//"
      * @see https://gravatar.com/site/implement/images/#secure-images
      */
    var protocol: js.UndefOr[String] = js.undefined
    
    /**
      * Gravatar allows users to self-rate their images so that they can indicate if an image is appropriate for a
      * certain audience. By default, only `g` rated images are displayed unless you indicate that you would like
      * to see higher ratings.
      *
      * @default "g"
      * @see https://gravatar.com/site/implement/images/#rating
      */
    var rating: js.UndefOr[Rating] = js.undefined
    
    /**
      * By default, images are presented at 50px by 50px if no size prop is supplied.
      *
      * @default 50
      * @see https://gravatar.com/site/implement/images/#size
      */
    var size: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDefault(value: DefaultImage): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setMd5(value: String): Self = StObject.set(x, "md5", value.asInstanceOf[js.Any])
      
      inline def setMd5Undefined: Self = StObject.set(x, "md5", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setRating(value: Rating): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
      
      inline def setRatingUndefined: Self = StObject.set(x, "rating", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactGravatar.reactGravatarStrings.g
    - typings.reactGravatar.reactGravatarStrings.pg
    - typings.reactGravatar.reactGravatarStrings.r
    - typings.reactGravatar.reactGravatarStrings.x
  */
  trait Rating extends StObject
  object Rating {
    
    inline def g: typings.reactGravatar.reactGravatarStrings.g = "g".asInstanceOf[typings.reactGravatar.reactGravatarStrings.g]
    
    inline def pg: typings.reactGravatar.reactGravatarStrings.pg = "pg".asInstanceOf[typings.reactGravatar.reactGravatarStrings.pg]
    
    inline def r: typings.reactGravatar.reactGravatarStrings.r = "r".asInstanceOf[typings.reactGravatar.reactGravatarStrings.r]
    
    inline def x: typings.reactGravatar.reactGravatarStrings.x = "x".asInstanceOf[typings.reactGravatar.reactGravatarStrings.x]
  }
}
