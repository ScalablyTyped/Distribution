package typings.primereact

import typings.primereact.accordionMod.AccordionProps
import typings.primereact.accordionMod.AccordionTabProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("primereact/accordion", "Accordion")
  @js.native
  class Accordion protected ()
    extends typings.primereact.accordionMod.Accordion {
    def this(props: AccordionProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: AccordionProps, context: js.Any) = this()
  }
  
  @JSImport("primereact/accordion", "AccordionTab")
  @js.native
  class AccordionTab protected ()
    extends typings.primereact.accordionMod.AccordionTab {
    def this(props: AccordionTabProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: AccordionTabProps, context: js.Any) = this()
  }
}
