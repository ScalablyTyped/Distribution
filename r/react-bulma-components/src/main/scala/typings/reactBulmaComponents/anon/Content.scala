package typings.reactBulmaComponents.anon

import typings.react.mod.ReactElement
import typings.reactBulmaComponents.reactBulmaComponentsStrings.div
import typings.reactBulmaComponents.reactBulmaComponentsStrings.figure
import typings.reactBulmaComponents.srcComponentsMod.BulmaComponent
import typings.reactBulmaComponents.srcComponentsMod.ElementProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content extends StObject {
  
  var Content: BulmaComponent[js.Object, div]
  
  var Footer: (BulmaComponent[js.Object, div]) & ItemBulmaComponent
  
  var Header: (BulmaComponent[js.Object, div]) & Icon
  
  var Image: BulmaComponent[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ImageProps */ Any, 
    figure
  ]
}
object Content {
  
  inline def apply(
    Content: /* props */ js.Object & (ElementProps[js.Object, div]) => ReactElement,
    Footer: (BulmaComponent[js.Object, div]) & ItemBulmaComponent,
    Header: (BulmaComponent[js.Object, div]) & Icon,
    Image: /* props */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ImageProps */ Any) & (ElementProps[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ImageProps */ Any, 
      figure
    ]) => ReactElement
  ): Content = {
    val __obj = js.Dynamic.literal(Content = js.Any.fromFunction1(Content), Footer = Footer.asInstanceOf[js.Any], Header = Header.asInstanceOf[js.Any], Image = js.Any.fromFunction1(Image))
    __obj.asInstanceOf[Content]
  }
  
  extension [Self <: Content](x: Self) {
    
    inline def setContent(value: /* props */ js.Object & (ElementProps[js.Object, div]) => ReactElement): Self = StObject.set(x, "Content", js.Any.fromFunction1(value))
    
    inline def setFooter(value: (BulmaComponent[js.Object, div]) & ItemBulmaComponent): Self = StObject.set(x, "Footer", value.asInstanceOf[js.Any])
    
    inline def setHeader(value: (BulmaComponent[js.Object, div]) & Icon): Self = StObject.set(x, "Header", value.asInstanceOf[js.Any])
    
    inline def setImage(
      value: /* props */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ImageProps */ Any) & (ElementProps[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ImageProps */ Any, 
          figure
        ]) => ReactElement
    ): Self = StObject.set(x, "Image", js.Any.fromFunction1(value))
  }
}
