package typings.randomItem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("random-item", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
  	Get a random item from an array.
  	@example
  	```
  	import randomItem = require('random-item');
  	randomItem(['🐴', '🦄', '🌈']);
  	//=> '🦄'
  	```
  	*/
  def apply[T](input: js.Array[T]): T = js.native
  
  /**
  	Get multiple random items from an array.
  	This is the equivalent of calling `randomItem()` multiple times so the returned array may contain duplicates.
  	@example
  	```
  	import randomItem = require('random-item');
  	randomItem.multiple(['🐴', '🦄', '🌈'], 2);
  	//=> ['🌈', '🦄']
  	```
  	*/
  def multiple[T](input: js.Array[T], count: Double): js.Array[T] = js.native
}
