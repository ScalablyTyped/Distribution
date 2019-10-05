package typings.atSindresorhusToDashMilliseconds.atSindresorhusToDashMillisecondsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@sindresorhus/to-milliseconds", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // TODO: remove this for next major version
  var default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof toMilliseconds */ js.Any = js.native
  /**
  	Convert an object of time properties to milliseconds: `{seconds: 2}` → `2000`.
  	@example
  	```
  	import toMilliseconds = require('@sindresorhus/to-milliseconds');
  	toMilliseconds({
  		days: 15,
  		hours: 11,
  		minutes: 23,
  		seconds: 20,
  		milliseconds: 1
  	});
  	//=> 1337000001
  	setTimeout(() => {
  		// …
  	}, toMilliseconds({minutes: 2}));
  	```
  	*/
  def apply(timeDescriptor: TimeDescriptor): Double = js.native
}

