package typings.serverless.classesPluginMod

import org.scalablytyped.runtime.StringDictionary
import typings.serverless.serverlessMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("serverless/classes/Plugin", JSImport.Namespace)
@js.native
abstract class ^ protected () extends Plugin {
  def this(serverless: typings.serverless.serverlessMod.^, options: Options) = this()
  /* CompleteClass */
  override var hooks: StringDictionary[js.Promise[_]] = js.native
}

