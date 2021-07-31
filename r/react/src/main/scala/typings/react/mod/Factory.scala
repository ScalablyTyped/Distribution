package typings.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
// Factories
// ----------------------------------------------------------------------
@js.native
trait Factory[P] extends StObject {
  
  def apply(props: Attributes & P, children: ReactNode*): ReactElement = js.native
  def apply(props: Unit, children: ReactNode*): ReactElement = js.native
}
