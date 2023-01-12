package typings.simpleIcons

import org.scalablytyped.runtime.Shortcut
import typings.simpleIcons.anon.Get
import typings.simpleIcons.anon.Type
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /**
    * @deprecated The `simple-icons` entrypoint will be removed in the next major. Please switch to using `import * as icons from "simple-icons/icons"` if you need an object with all the icons.
    */
  @JSImport("simple-icons", JSImport.Default)
  @js.native
  val default: (Record[String, SimpleIcon]) & Get = js.native
  
  trait SimpleIcon extends StObject {
    
    var guidelines: js.UndefOr[String] = js.undefined
    
    var hex: String
    
    var license: js.UndefOr[Type] = js.undefined
    
    var path: String
    
    var slug: String
    
    var source: String
    
    var svg: String
    
    var title: String
  }
  object SimpleIcon {
    
    inline def apply(hex: String, path: String, slug: String, source: String, svg: String, title: String): SimpleIcon = {
      val __obj = js.Dynamic.literal(hex = hex.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleIcon]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SimpleIcon] (val x: Self) extends AnyVal {
      
      inline def setGuidelines(value: String): Self = StObject.set(x, "guidelines", value.asInstanceOf[js.Any])
      
      inline def setGuidelinesUndefined: Self = StObject.set(x, "guidelines", js.undefined)
      
      inline def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
      
      inline def setLicense(value: Type): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
      
      inline def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSvg(value: String): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = (Record[String, SimpleIcon]) & Get
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: (Record[String, SimpleIcon]) & Get = default
}
