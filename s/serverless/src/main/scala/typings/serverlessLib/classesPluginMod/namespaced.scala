package typings
package serverlessLib.classesPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("serverless/classes/Plugin", JSImport.Namespace)
@js.native
abstract class namespaced protected () extends Plugin {
  def this(serverless: serverlessLib.serverlessMod.namespaced, options: serverlessLib.serverlessMod.ServerlessNs.Options) = this()
  /* CompleteClass */
  override var hooks: org.scalablytyped.runtime.StringDictionary[js.Promise[_]] = js.native
}

