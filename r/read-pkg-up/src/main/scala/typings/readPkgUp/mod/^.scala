package typings.readPkgUp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("read-pkg-up", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
  	Read the closest `package.json` file.
  	@example
  	```
  	import readPkgUp = require('read-pkg-up');
  	(async () => {
  		console.log(await readPkgUp());
  		// {
  		// 	packageJson: {
  		// 		name: 'awesome-package',
  		// 		version: '1.0.0',
  		// 		…
  		// 	},
  		// 	path: '/Users/sindresorhus/dev/awesome-package/package.json'
  		// }
  	})();
  	```
  	*/
  def apply(): js.Promise[js.UndefOr[NormalizedReadResult]] = js.native
  def apply(options: NormalizeOptions): js.Promise[js.UndefOr[NormalizedReadResult]] = js.native
  def apply(options: Options): js.Promise[js.UndefOr[ReadResult]] = js.native
  
  /**
  	Synchronously read the closest `package.json` file.
  	@example
  	```
  	import readPkgUp = require('read-pkg-up');
  	console.log(readPkgUp.sync());
  	// {
  	// 	packageJson: {
  	// 		name: 'awesome-package',
  	// 		version: '1.0.0',
  	// 		…
  	// 	},
  	// 	path: '/Users/sindresorhus/dev/awesome-package/package.json'
  	// }
  	```
  	*/
  def sync(): js.UndefOr[NormalizedReadResult] = js.native
  def sync(options: NormalizeOptions): js.UndefOr[NormalizedReadResult] = js.native
  def sync(options: Options): js.UndefOr[ReadResult] = js.native
}
