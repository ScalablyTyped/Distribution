package typings.simpleIcons

import typings.simpleIcons.simpleIconsStrings.custom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait CustomLicense
    extends StObject
       with License {
    
    var `type`: custom
    
    var url: String
  }
  object CustomLicense {
    
    inline def apply(url: String): CustomLicense = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("custom")
      __obj.asInstanceOf[CustomLicense]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomLicense] (val x: Self) extends AnyVal {
      
      inline def setType(value: custom): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.simpleIcons.typesMod.SPDXLicense
    - typings.simpleIcons.typesMod.CustomLicense
  */
  trait License extends StObject
  object License {
    
    inline def CustomLicense(url: String): typings.simpleIcons.typesMod.CustomLicense = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("custom")
      __obj.asInstanceOf[typings.simpleIcons.typesMod.CustomLicense]
    }
    
    inline def SPDXLicense(`type`: String): typings.simpleIcons.typesMod.SPDXLicense = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.simpleIcons.typesMod.SPDXLicense]
    }
  }
  
  trait SPDXLicense
    extends StObject
       with License {
    
    var `type`: String
    
    var url: js.UndefOr[String] = js.undefined
  }
  object SPDXLicense {
    
    inline def apply(`type`: String): SPDXLicense = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SPDXLicense]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SPDXLicense] (val x: Self) extends AnyVal {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait SimpleIcon extends StObject {
    
    var guidelines: js.UndefOr[String] = js.undefined
    
    var hex: String
    
    var license: js.UndefOr[License] = js.undefined
    
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
      
      inline def setLicense(value: License): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
      
      inline def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSvg(value: String): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
