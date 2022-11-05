package typings.safeRegexTest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Give a regex, get a robust predicate function that tests it against a string.
    * This will work even if `RegExp.prototype` is altered later.
    *
    * @example
    * import regexTester = require('safe-regex-test');
    * import * as assert from 'node:assert';
    *
    * const tester = regexTester(/a/);
    * assert.ok(tester('a') === true);
    * assert.ok(tester('b') === false);
    */
  inline def apply(regex: js.RegExp): js.Function1[/* s */ String, Boolean] = ^.asInstanceOf[js.Dynamic].apply(regex.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* s */ String, Boolean]]
  
  @JSImport("safe-regex-test", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
