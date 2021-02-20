package typings.reactIcons

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.SVGAttributes
import typings.react.mod.global.JSX.Element
import typings.reactIcons.anon.IconBasePropsattrundefine
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconBaseMod {
  
  @JSImport("react-icons/lib/esm/iconBase", "GenIcon")
  @js.native
  def GenIcon(data: IconTree): js.Function1[/* props */ IconBaseProps, Element] = js.native
  
  @JSImport("react-icons/lib/esm/iconBase", "IconBase")
  @js.native
  def IconBase(props: IconBasePropsattrundefine): Element = js.native
  
  @js.native
  trait IconBaseProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.native
    
    var title: js.UndefOr[String] = js.native
  }
  object IconBaseProps {
    
    @scala.inline
    def apply(): IconBaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconBaseProps]
    }
    
    @scala.inline
    implicit class IconBasePropsMutableBuilder[Self <: IconBaseProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait IconTree extends StObject {
    
    var attr: StringDictionary[String] = js.native
    
    var child: js.Array[IconTree] = js.native
    
    var tag: String = js.native
  }
  object IconTree {
    
    @scala.inline
    def apply(attr: StringDictionary[String], child: js.Array[IconTree], tag: String): IconTree = {
      val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], child = child.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconTree]
    }
    
    @scala.inline
    implicit class IconTreeMutableBuilder[Self <: IconTree] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttr(value: StringDictionary[String]): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChild(value: js.Array[IconTree]): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildVarargs(value: IconTree*): Self = StObject.set(x, "child", js.Array(value :_*))
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
  
  type IconType = js.Function1[/* props */ IconBaseProps, Element]
}
