package typings
package remotedevDashSerializeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object remotedevDashSerializeMod {
  type DefaultReplacer = js.Function2[/* key */ java.lang.String, /* value */ js.Any, js.Any]
  type DefaultReviver = js.Function2[/* key */ java.lang.String, /* value */ js.Any, js.Any]
  type Options = stdLib.Record[java.lang.String, scala.Boolean]
  type Refs = stdLib.Record[java.lang.String, js.Any]
  type Replacer = js.Function3[/* key */ java.lang.String, /* value */ js.Any, /* replacer */ DefaultReplacer, js.Any]
  type Reviver = js.Function3[/* key */ java.lang.String, /* value */ js.Any, /* reviver */ DefaultReviver, js.Any]
}
