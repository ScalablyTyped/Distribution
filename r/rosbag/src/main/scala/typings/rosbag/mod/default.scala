package typings.rosbag.mod

import org.scalablytyped.runtime.NumberDictionary
import typings.std.Blob
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rosbag", JSImport.Default)
@js.native
open class default protected ()
  extends StObject
     with Bag {
  /**
    * the high level rosbag interface
    * create a new bag by calling:
    * `const bag = await Bag.open('./path-to-file.bag')` in node or
    * `const bag = await Bag.open(files[0])` in the browser
    *
    * after that you can consume messages by calling
    * `await bag.readMessages({ topics: ['/foo'] },
    * (result) => console.log(result.topic, result.message))`
    *
    * you can optionally create a bag manually passing in a bagReader instance
    *
    * @param bagReader
    */
  def this(bagReader: BagReader) = this()
  
  /* CompleteClass */
  var chunkInfos: js.Array[ChunkInfo] = js.native
  
  /* CompleteClass */
  var connections: NumberDictionary[Connection] = js.native
  
  /* CompleteClass */
  var header: BagHeader = js.native
  
  /**
    * if the bag is manually created with the constructor, you must call `await open()` on the bag
    * generally this is called for you if you're using `const bag = await Bag.open()`
    */
  /* CompleteClass */
  override def open(): js.Promise[Unit] = js.native
  
  /* CompleteClass */
  override def readMessages(opts: ReadOptions, callback: js.Function1[/* msg */ ReadResult[Any], Unit]): js.Promise[Unit] = js.native
  
  /* CompleteClass */
  var reader: BagReader = js.native
}
object default {
  
  @JSImport("rosbag", JSImport.Default)
  @js.native
  val ^ : js.Any = js.native
  
  inline def open(file: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(file.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def open(file: Blob): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(file.asInstanceOf[js.Any]).asInstanceOf[Unit]
  /**
    * This method should have been overridden based on the environment.
    * Make sure you are correctly importing the node or web version of Bag.
    * @param file
    */
  /* static member */
  inline def open(file: File): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(file.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
