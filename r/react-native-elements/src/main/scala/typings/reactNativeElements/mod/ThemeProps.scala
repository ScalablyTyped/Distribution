package typings.reactNativeElements.mod

import typings.reactNativeElements.anon.RecursivePartialFullTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeProps[T] extends StObject {
  
  var replaceTheme: ReplaceTheme
  
  var theme: Theme[T]
  
  var updateTheme: UpdateTheme
}
object ThemeProps {
  
  @scala.inline
  def apply[T](
    replaceTheme: /* updates */ RecursivePartialFullTheme => Unit,
    theme: Theme[T],
    updateTheme: /* updates */ RecursivePartialFullTheme => Unit
  ): ThemeProps[T] = {
    val __obj = js.Dynamic.literal(replaceTheme = js.Any.fromFunction1(replaceTheme), theme = theme.asInstanceOf[js.Any], updateTheme = js.Any.fromFunction1(updateTheme))
    __obj.asInstanceOf[ThemeProps[T]]
  }
  
  @scala.inline
  implicit class ThemePropsMutableBuilder[Self <: ThemeProps[?], T] (val x: Self & ThemeProps[T]) extends AnyVal {
    
    @scala.inline
    def setReplaceTheme(value: /* updates */ RecursivePartialFullTheme => Unit): Self = StObject.set(x, "replaceTheme", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTheme(value: Theme[T]): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTheme(value: /* updates */ RecursivePartialFullTheme => Unit): Self = StObject.set(x, "updateTheme", js.Any.fromFunction1(value))
  }
}
