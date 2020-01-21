package typings.readPkgUp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(options: NormalizeOptions | Options): js.Promise[js.UndefOr[NormalizedReadResult]] = js.native
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
  def sync(options: NormalizeOptions | Options): js.UndefOr[NormalizedReadResult] = js.native
}

