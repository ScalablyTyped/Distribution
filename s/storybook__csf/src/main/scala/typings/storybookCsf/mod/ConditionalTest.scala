package typings.storybookCsf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.storybookCsf.anon.Truthy
  - typings.storybookCsf.anon.Exists
  - typings.storybookCsf.anon.Eq
  - typings.storybookCsf.anon.Neq
*/
trait ConditionalTest extends StObject
object ConditionalTest {
  
  inline def Eq(eq_ : Any): typings.storybookCsf.anon.Eq = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("eq")(eq_.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.storybookCsf.anon.Eq]
  }
  
  inline def Exists(exists: Boolean): typings.storybookCsf.anon.Exists = {
    val __obj = js.Dynamic.literal(exists = exists.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.storybookCsf.anon.Exists]
  }
  
  inline def Neq(neq: Any): typings.storybookCsf.anon.Neq = {
    val __obj = js.Dynamic.literal(neq = neq.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.storybookCsf.anon.Neq]
  }
  
  inline def Truthy(): typings.storybookCsf.anon.Truthy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.storybookCsf.anon.Truthy]
  }
}
