package typings.reactIntl

import org.scalablytyped.runtime.Shortcut
import typings.formatjsIntl.srcTypesMod.MessageDescriptor
import typings.intlMessageformat.srcFormattersMod.FormatXMLElementFn
import typings.react.mod.ElementType
import typings.react.mod.NamedExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactFragment
import typings.react.mod.ReactNode
import typings.react.mod.ReactPortal
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsMessageMod extends Shortcut {
  
  @JSImport("react-intl/src/components/message", JSImport.Default)
  @js.native
  val default: NamedExoticComponent[
    Props[
      Record[
        String, 
        js.UndefOr[
          String | Double | Boolean | ReactElement | ReactFragment | ReactPortal | js.Date | (FormatXMLElementFn[ReactNode, ReactNode]) | Null
        ]
      ]
    ]
  ] = js.native
  
  trait Props[V /* <: Record[String, Any] */]
    extends StObject
       with MessageDescriptor {
    
    var children: js.UndefOr[js.Function1[/* nodes */ js.Array[ReactNode], ReactElement | Null]] = js.undefined
    
    var ignoreTag: js.UndefOr[Boolean] = js.undefined
    
    var tagName: js.UndefOr[ElementType[Any]] = js.undefined
    
    var values: js.UndefOr[V] = js.undefined
  }
  object Props {
    
    inline def apply[V /* <: Record[String, Any] */](): Props[V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props[V]]
    }
    
    extension [Self <: Props[?], V /* <: Record[String, Any] */](x: Self & Props[V]) {
      
      inline def setChildren(value: /* nodes */ js.Array[ReactNode] => ReactElement | Null): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setIgnoreTag(value: Boolean): Self = StObject.set(x, "ignoreTag", value.asInstanceOf[js.Any])
      
      inline def setIgnoreTagUndefined: Self = StObject.set(x, "ignoreTag", js.undefined)
      
      inline def setTagName(value: ElementType[Any]): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
      
      inline def setValues(value: V): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    }
  }
  
  type _To = NamedExoticComponent[
    Props[
      Record[
        String, 
        js.UndefOr[
          String | Double | Boolean | ReactElement | ReactFragment | ReactPortal | js.Date | (FormatXMLElementFn[ReactNode, ReactNode]) | Null
        ]
      ]
    ]
  ]
  
  /* This means you don't have to write `default`, but can instead just say `componentsMessageMod.foo` */
  override def _to: NamedExoticComponent[
    Props[
      Record[
        String, 
        js.UndefOr[
          String | Double | Boolean | ReactElement | ReactFragment | ReactPortal | js.Date | (FormatXMLElementFn[ReactNode, ReactNode]) | Null
        ]
      ]
    ]
  ] = default
}
