package typings.reactIcons

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.SVGAttributes
import typings.react.mod.global.JSX.Element
import typings.reactIcons.anon.IconBasePropsattrundefine
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmIconBaseMod {
  
  @JSImport("react-icons/lib/esm/iconBase", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def GenIcon(data: IconTree): js.Function1[/* props */ IconBaseProps, Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("GenIcon")(data.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* props */ IconBaseProps, Element]]
  
  inline def IconBase(props: IconBasePropsattrundefine): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("IconBase")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait IconBaseProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object IconBaseProps {
    
    inline def apply(): IconBaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconBaseProps]
    }
    
    extension [Self <: IconBaseProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait IconTree extends StObject {
    
    var attr: StringDictionary[String]
    
    var child: js.Array[IconTree]
    
    var tag: String
  }
  object IconTree {
    
    inline def apply(attr: StringDictionary[String], child: js.Array[IconTree], tag: String): IconTree = {
      val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], child = child.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconTree]
    }
    
    extension [Self <: IconTree](x: Self) {
      
      inline def setAttr(value: StringDictionary[String]): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
      
      inline def setChild(value: js.Array[IconTree]): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
      
      inline def setChildVarargs(value: IconTree*): Self = StObject.set(x, "child", js.Array(value*))
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
  
  type IconType = js.Function1[/* props */ IconBaseProps, Element]
}
