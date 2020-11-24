package typings.recurlyRecurlyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object elementsMod {
  
  type Attach[ElementType] = js.Function1[/* el */ java.lang.String | typings.std.HTMLElement, ElementType]
  
  type Elements = js.Function0[typings.recurlyRecurlyJs.elementsMod.ElementsInstance]
  
  type ElementsInstanceEvents = typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.submit
}
