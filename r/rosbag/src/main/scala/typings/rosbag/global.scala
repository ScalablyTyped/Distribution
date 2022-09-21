package typings.rosbag

import typings.rosbag.mod.BagReader
import typings.rosbag.mod.default
import typings.std.Blob
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("rosbag")
  @js.native
  open class rosbag protected () extends default {
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
  }
  object rosbag {
    
    @JSGlobal("rosbag")
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
}
