package typings.reactMdMenu.typesTypesMod

import typings.react.mod.CSSProperties
import typings.reactMdMenu.anon.ReadonlyPropsWithRefOmitL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuListProps extends StObject {
  
  /**
    * An optional className to provide to the `List` component that surrounds the
    * `MenuItem` within a `Menu`.
    */
  var listClassName: js.UndefOr[String] = js.undefined
  
  /**
    * Any additional props to pass to the `List` component that surrounds the
    * `Menu`'s `MenuItem`s.
    */
  var listProps: js.UndefOr[ReadonlyPropsWithRefOmitL] = js.undefined
  
  /**
    * An optional style to provide to the `List` component that surrounds the
    * `MenuItem` within a `Menu`.
    */
  var listStyle: js.UndefOr[CSSProperties] = js.undefined
}
object MenuListProps {
  
  inline def apply(): MenuListProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuListProps]
  }
  
  extension [Self <: MenuListProps](x: Self) {
    
    inline def setListClassName(value: String): Self = StObject.set(x, "listClassName", value.asInstanceOf[js.Any])
    
    inline def setListClassNameUndefined: Self = StObject.set(x, "listClassName", js.undefined)
    
    inline def setListProps(value: ReadonlyPropsWithRefOmitL): Self = StObject.set(x, "listProps", value.asInstanceOf[js.Any])
    
    inline def setListPropsUndefined: Self = StObject.set(x, "listProps", js.undefined)
    
    inline def setListStyle(value: CSSProperties): Self = StObject.set(x, "listStyle", value.asInstanceOf[js.Any])
    
    inline def setListStyleUndefined: Self = StObject.set(x, "listStyle", js.undefined)
  }
}
