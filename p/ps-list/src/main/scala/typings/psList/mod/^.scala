package typings.psList.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ps-list", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // TODO: remove this in the next major version, refactor the whole definition to:
  // declare function psList(options?: psList.Options): Promise<psList.ProcessDescriptor[]>;
  // export = psList;
  var default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof psList */ js.Any = js.native
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

