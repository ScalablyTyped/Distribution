package typings.reactSvgInline

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ElementType
import typings.reactSvgInline.reactSvgInlineStrings.comment
import typings.reactSvgInline.reactSvgInlineStrings.defs
import typings.reactSvgInline.reactSvgInlineStrings.desc
import typings.reactSvgInline.reactSvgInlineStrings.fill
import typings.reactSvgInline.reactSvgInlineStrings.height
import typings.reactSvgInline.reactSvgInlineStrings.sketchMSLayerGroup
import typings.reactSvgInline.reactSvgInlineStrings.sketchMSPage
import typings.reactSvgInline.reactSvgInlineStrings.sketchMSShapeGroup
import typings.reactSvgInline.reactSvgInlineStrings.title
import typings.reactSvgInline.reactSvgInlineStrings.width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-svg-inline", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Component[SVGInlineProps, ComponentState, Any] {
    def this(props: SVGInlineProps) = this()
    def this(props: SVGInlineProps, context: Any) = this()
  }
  @JSImport("react-svg-inline", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SVGInline = js.native
  
  type SVGInline = ComponentClass[SVGInlineProps, ComponentState]
  
  trait SVGInlineProps extends StObject {
    
    var accessibilityDesc: js.UndefOr[String] = js.undefined
    
    var accessibilityLabel: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var classSuffix: js.UndefOr[String] = js.undefined
    
    var cleanup: js.UndefOr[
        Boolean | (js.Array[
          title | desc | comment | defs | width | height | fill | sketchMSShapeGroup | sketchMSPage | sketchMSLayerGroup
        ])
      ] = js.undefined
    
    var cleanupExceptions: js.UndefOr[
        js.Array[
          title | desc | comment | defs | width | height | fill | sketchMSShapeGroup | sketchMSPage | sketchMSLayerGroup
        ]
      ] = js.undefined
    
    var component: js.UndefOr[ElementType[Any]] = js.undefined
    
    var fill: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[String] = js.undefined
    
    var svg: String
    
    var width: js.UndefOr[String] = js.undefined
  }
  object SVGInlineProps {
    
    inline def apply(svg: String): SVGInlineProps = {
      val __obj = js.Dynamic.literal(svg = svg.asInstanceOf[js.Any])
      __obj.asInstanceOf[SVGInlineProps]
    }
    
    extension [Self <: SVGInlineProps](x: Self) {
      
      inline def setAccessibilityDesc(value: String): Self = StObject.set(x, "accessibilityDesc", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityDescUndefined: Self = StObject.set(x, "accessibilityDesc", js.undefined)
      
      inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClassSuffix(value: String): Self = StObject.set(x, "classSuffix", value.asInstanceOf[js.Any])
      
      inline def setClassSuffixUndefined: Self = StObject.set(x, "classSuffix", js.undefined)
      
      inline def setCleanup(
        value: Boolean | (js.Array[
              title | desc | comment | defs | width | height | fill | sketchMSShapeGroup | sketchMSPage | sketchMSLayerGroup
            ])
      ): Self = StObject.set(x, "cleanup", value.asInstanceOf[js.Any])
      
      inline def setCleanupExceptions(
        value: js.Array[
              title | desc | comment | defs | width | height | fill | sketchMSShapeGroup | sketchMSPage | sketchMSLayerGroup
            ]
      ): Self = StObject.set(x, "cleanupExceptions", value.asInstanceOf[js.Any])
      
      inline def setCleanupExceptionsUndefined: Self = StObject.set(x, "cleanupExceptions", js.undefined)
      
      inline def setCleanupExceptionsVarargs(
        value: (title | desc | comment | defs | width | height | fill | sketchMSShapeGroup | sketchMSPage | sketchMSLayerGroup)*
      ): Self = StObject.set(x, "cleanupExceptions", js.Array(value*))
      
      inline def setCleanupUndefined: Self = StObject.set(x, "cleanup", js.undefined)
      
      inline def setCleanupVarargs(
        value: (title | desc | comment | defs | width | height | fill | sketchMSShapeGroup | sketchMSPage | sketchMSLayerGroup)*
      ): Self = StObject.set(x, "cleanup", js.Array(value*))
      
      inline def setComponent(value: ElementType[Any]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setSvg(value: String): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type _To = js.Object & SVGInline
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & SVGInline = ^
}
