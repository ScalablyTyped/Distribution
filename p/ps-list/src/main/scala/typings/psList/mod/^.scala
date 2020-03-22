package typings.psList.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ps-list", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  Get running processes.
  @returns List of running processes.
  @example
  ```
  import psList = require('ps-list');
  (async () => {
  	console.log(await psList());
  	//=> [{pid: 3213, name: 'node', cmd: 'node test.js', ppid: 1, uid: 501, cpu: 0.1, memory: 1.5}, …]
  })();
  ```
  */
  def apply(): js.Promise[js.Array[ProcessDescriptor]] = js.native
  def apply(options: Options): js.Promise[js.Array[ProcessDescriptor]] = js.native
}

