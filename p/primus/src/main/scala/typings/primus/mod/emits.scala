package typings.primus.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/primus/emits
// This can't be typed correctly
//  - https://github.com/microsoft/TypeScript/issues/1360
//  - https://stackoverflow.com/questions/22043041/typescript-rest-parameter-in-the-middle-of-arguments-list
@JSImport("primus", "emits")
@js.native
object emits extends js.Object {
  @js.native
  trait emits extends js.Object {
    def apply(event: String, arg1: js.Any, parser: parser): fn = js.native
    def apply(event: String, args: js.Any*): fn = js.native
    def apply(event: String, parser: parser): fn = js.native
  }
  
  type done = js.Function2[/* err */ js.UndefOr[Error | Null], /* arg */ js.Any, Unit]
  type fn = js.Function1[/* repeated */ js.Any, Boolean]
  type parser = js.Function2[/* done */ done, /* repeated */ js.Any, Unit]
}

