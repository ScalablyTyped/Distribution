package typings.primereact

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object footerCellMod {
  
  @JSImport("primereact/components/datatable/FooterCell", "FooterCell")
  @js.native
  class FooterCell protected ()
    extends Component[FooterCellProps, js.Any, js.Any] {
    def this(props: FooterCellProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FooterCellProps, context: js.Any) = this()
  }
  
  // tslint:disable-next-line:no-empty-interface
  trait FooterCellProps extends StObject
}
