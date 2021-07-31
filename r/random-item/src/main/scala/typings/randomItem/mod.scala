package typings.randomItem

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Get a random item from an array.
  	@example
  	```
  	import randomItem = require('random-item');
  	randomItem(['🐴', '🦄', '🌈']);
  	//=> '🦄'
  	```
  	*/
  @scala.inline
  def apply[T](input: js.Array[T]): T = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @JSImport("random-item", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  @scala.inline
  def multiple[T](input: js.Array[T], count: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("multiple")(input.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
}
