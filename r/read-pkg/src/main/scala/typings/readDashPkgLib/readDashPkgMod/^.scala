package typings
package readDashPkgLib.readDashPkgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("read-pkg", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  	@returns The parsed JSON.
  	@example
  	```
  	import readPkg = require('read-pkg');
  	(async () => {
  		console.log(await readPkg());
  		//=> {name: 'read-pkg', …}
  		console.log(await readPkg({cwd: 'some-other-directory'});
  		//=> {name: 'unicorn', …}
  	})();
  	```
  	*/
  def apply(): js.Promise[NormalizedPackageJson] = js.native
  def apply(options: NormalizeOptions): js.Promise[NormalizedPackageJson] = js.native
  def apply(options: Options): js.Promise[PackageJson] = js.native
  /**
  	@returns The parsed JSON.
  	@example
  	```
  	import readPkg = require('read-pkg');
  	console.log(readPkg.sync());
  	//=> {name: 'read-pkg', …}
  	console.log(readPkg.sync({cwd: 'some-other-directory'});
  	//=> {name: 'unicorn', …}
  	```
  	*/
  def sync(): NormalizedPackageJson = js.native
  def sync(options: NormalizeOptions): NormalizedPackageJson = js.native
  def sync(options: Options): PackageJson = js.native
}

