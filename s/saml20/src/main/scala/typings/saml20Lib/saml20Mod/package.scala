package typings
package saml20Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object saml20Mod {
  type ParseCallback = js.Function3[
    /* err */ stdLib.Error | scala.Null, 
    /* profile */ Profile, 
    /* version */ java.lang.String, 
    scala.Unit
  ]
  type ValidationOptions = ValidationOptionsWithKey | ValidationOptionsWithPrint
}
