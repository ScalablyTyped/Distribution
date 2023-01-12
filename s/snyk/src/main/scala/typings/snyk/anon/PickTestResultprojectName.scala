package typings.snyk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<snyk.snyk/dist/lib/snyk-test/legacy.TestResult, 'projectName'> */
trait PickTestResultprojectName extends StObject {
  
  var projectName: js.UndefOr[String] = js.undefined
}
object PickTestResultprojectName {
  
  inline def apply(): PickTestResultprojectName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickTestResultprojectName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickTestResultprojectName] (val x: Self) extends AnyVal {
    
    inline def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    inline def setProjectNameUndefined: Self = StObject.set(x, "projectName", js.undefined)
  }
}
