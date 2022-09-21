package typings.reactSketchapp

import org.scalablytyped.runtime.StringDictionary
import typings.reactSketchapp.anon.Clear
import typings.reactSketchapp.moduleTypesMod.PlatformBridge
import typings.reactSketchapp.moduleTypesMod.SketchDocument
import typings.reactSketchapp.moduleTypesMod.SketchDocumentData
import typings.reactSketchapp.moduleTypesMod.TextStyle
import typings.reactSketchapp.moduleTypesMod.WrappedSketchDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textStylesMod {
  
  @JSImport("react-sketchapp/lib/module/sharedStyles/TextStyles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def TextStyles(getDefaultBridge: js.Function0[PlatformBridge]): Clear = ^.asInstanceOf[js.Dynamic].applyDynamic("TextStyles")(getDefaultBridge.asInstanceOf[js.Any]).asInstanceOf[Clear]
  
  trait Options extends StObject {
    
    var clearExistingStyles: js.UndefOr[Boolean] = js.undefined
    
    var document: js.UndefOr[SketchDocumentData | SketchDocument | WrappedSketchDocument] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setClearExistingStyles(value: Boolean): Self = StObject.set(x, "clearExistingStyles", value.asInstanceOf[js.Any])
      
      inline def setClearExistingStylesUndefined: Self = StObject.set(x, "clearExistingStyles", js.undefined)
      
      inline def setDocument(value: SketchDocumentData | SketchDocument | WrappedSketchDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    }
  }
  
  trait RegisteredStyle extends StObject {
    
    var cssStyle: TextStyle
    
    var name: String
    
    var sharedObjectID: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Uuid */ Any
    
    var sketchStyle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Style */ Any
  }
  object RegisteredStyle {
    
    inline def apply(
      cssStyle: TextStyle,
      name: String,
      sharedObjectID: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Uuid */ Any,
      sketchStyle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Style */ Any
    ): RegisteredStyle = {
      val __obj = js.Dynamic.literal(cssStyle = cssStyle.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sharedObjectID = sharedObjectID.asInstanceOf[js.Any], sketchStyle = sketchStyle.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegisteredStyle]
    }
    
    extension [Self <: RegisteredStyle](x: Self) {
      
      inline def setCssStyle(value: TextStyle): Self = StObject.set(x, "cssStyle", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSharedObjectID(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Uuid */ Any
      ): Self = StObject.set(x, "sharedObjectID", value.asInstanceOf[js.Any])
      
      inline def setSketchStyle(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Style */ Any
      ): Self = StObject.set(x, "sketchStyle", value.asInstanceOf[js.Any])
    }
  }
  
  type StyleHash = StringDictionary[RegisteredStyle]
}
