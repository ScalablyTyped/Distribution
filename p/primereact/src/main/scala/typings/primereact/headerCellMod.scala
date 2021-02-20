package typings.primereact

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerCellMod {
  
  @JSImport("primereact/components/datatable/HeaderCell", "HeaderCell")
  @js.native
  class HeaderCell protected ()
    extends Component[HeaderCellProps, js.Any, js.Any] {
    def this(props: HeaderCellProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: HeaderCellProps, context: js.Any) = this()
  }
  
  // tslint:disable-next-line:no-empty-interface
  @js.native
  trait HeaderCellProps extends StObject
}
