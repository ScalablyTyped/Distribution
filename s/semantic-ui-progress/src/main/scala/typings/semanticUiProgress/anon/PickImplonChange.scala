package typings.semanticUiProgress.anon

import typings.semanticUiProgress.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.ProgressSettings._Impl, 'onChange'> */
trait PickImplonChange extends StObject {
  
  def onChange(percent: Double, value: Double, total: Double): Unit
  @JSName("onChange")
  var onChange_Original: js.ThisFunction3[/* this */ JQuery, /* percent */ Double, /* value */ Double, /* total */ Double, Unit]
}
object PickImplonChange {
  
  @scala.inline
  def apply(
    onChange: js.ThisFunction3[/* this */ JQuery, /* percent */ Double, /* value */ Double, /* total */ Double, Unit]
  ): PickImplonChange = {
    val __obj = js.Dynamic.literal(onChange = onChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonChange]
  }
  
  @scala.inline
  implicit class PickImplonChangeMutableBuilder[Self <: PickImplonChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnChange(
      value: js.ThisFunction3[/* this */ JQuery, /* percent */ Double, /* value */ Double, /* total */ Double, Unit]
    ): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
  }
}
