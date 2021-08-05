package typings.reactAsync.mod

import typings.react.mod.Component
import typings.reactAsync.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("react-async", JSImport.Default)
@js.native
class default[T] ()
  extends Component[AsyncProps[T], AsyncState[T, AbstractState[T]], js.Any]
object default {
  
  inline def apply: GenericAsync = ^.asInstanceOf[js.Dynamic].selectDynamic("default").asInstanceOf[GenericAsync]
}
