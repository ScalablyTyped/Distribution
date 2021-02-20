package typings.primereact

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableHeaderMod {
  
  @JSImport("primereact/components/datatable/TableHeader", "TableHeader")
  @js.native
  class TableHeader protected ()
    extends Component[TableHeaderProps, js.Any, js.Any] {
    def this(props: TableHeaderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TableHeaderProps, context: js.Any) = this()
  }
  
  // tslint:disable-next-line:no-empty-interface
  @js.native
  trait TableHeaderProps extends StObject
}
