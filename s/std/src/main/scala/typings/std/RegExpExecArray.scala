package typings.std

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegExpExecArray
  extends StObject
     with Array[java.lang.String] {
  
  /**
    * The first match. This will always be present because `null` will be returned if there are no matches.
    */
  /* standard es5 */
  var `0`: java.lang.String = js.native
  
  /* standard es2018.regexp */
  var groups: js.UndefOr[/* standard es2018.regexp */
  StringDictionary[java.lang.String]] = js.native
  
  /**
    * The index of the search at which the result was found.
    */
  /* standard es5 */
  var index: Double = js.native
  
  /* standard es2022.regexp */
  var indices: js.UndefOr[RegExpIndicesArray] = js.native
  
  /**
    * A copy of the search string.
    */
  /* standard es5 */
  var input: java.lang.String = js.native
}
