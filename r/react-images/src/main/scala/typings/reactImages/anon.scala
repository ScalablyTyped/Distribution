package typings.reactImages

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Blanket extends StObject {
    
    var blanket: js.UndefOr[js.Function2[/* base */ CSSProperties, /* state */ Any, CSSProperties]] = js.undefined
    
    var dialog: js.UndefOr[js.Function2[/* base */ CSSProperties, /* state */ Any, CSSProperties]] = js.undefined
    
    var positioner: js.UndefOr[js.Function2[/* base */ CSSProperties, /* state */ Any, CSSProperties]] = js.undefined
  }
  object Blanket {
    
    inline def apply(): Blanket = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Blanket]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Blanket] (val x: Self) extends AnyVal {
      
      inline def setBlanket(value: (/* base */ CSSProperties, /* state */ Any) => CSSProperties): Self = StObject.set(x, "blanket", js.Any.fromFunction2(value))
      
      inline def setBlanketUndefined: Self = StObject.set(x, "blanket", js.undefined)
      
      inline def setDialog(value: (/* base */ CSSProperties, /* state */ Any) => CSSProperties): Self = StObject.set(x, "dialog", js.Any.fromFunction2(value))
      
      inline def setDialogUndefined: Self = StObject.set(x, "dialog", js.undefined)
      
      inline def setPositioner(value: (/* base */ CSSProperties, /* state */ Any) => CSSProperties): Self = StObject.set(x, "positioner", js.Any.fromFunction2(value))
      
      inline def setPositionerUndefined: Self = StObject.set(x, "positioner", js.undefined)
    }
  }
  
  trait Download extends StObject {
    
    var download: js.UndefOr[String] = js.undefined
    
    var fullscreen: js.UndefOr[String] = js.undefined
    
    var regular: String
    
    var thumbnail: js.UndefOr[String] = js.undefined
  }
  object Download {
    
    inline def apply(regular: String): Download = {
      val __obj = js.Dynamic.literal(regular = regular.asInstanceOf[js.Any])
      __obj.asInstanceOf[Download]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Download] (val x: Self) extends AnyVal {
      
      inline def setDownload(value: String): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
      
      inline def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
      
      inline def setFullscreen(value: String): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
      
      inline def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
      
      inline def setRegular(value: String): Self = StObject.set(x, "regular", value.asInstanceOf[js.Any])
      
      inline def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
      
      inline def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
    }
  }
  
  trait Props extends StObject {
    
    var props: String
    
    var stops: js.Array[js.Tuple2[Double, Double]]
  }
  object Props {
    
    inline def apply(props: String, stops: js.Array[js.Tuple2[Double, Double]]): Props = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setProps(value: String): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setStops(value: js.Array[js.Tuple2[Double, Double]]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
      
      inline def setStopsVarargs(value: (js.Tuple2[Double, Double])*): Self = StObject.set(x, "stops", js.Array(value*))
    }
  }
}
