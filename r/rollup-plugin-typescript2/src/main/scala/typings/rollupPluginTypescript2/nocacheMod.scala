package typings.rollupPluginTypescript2

import typings.rollupPluginTypescript2.icacheMod.ICache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nocacheMod {
  
  @JSImport("rollup-plugin-typescript2/dist/nocache", "NoCache")
  @js.native
  class NoCache[DataType] ()
    extends StObject
       with ICache[DataType] {
    
    /* CompleteClass */
    override def exists(name: String): Boolean = js.native
    
    /* CompleteClass */
    override def `match`(names: js.Array[String]): Boolean = js.native
    
    /* CompleteClass */
    override def path(name: String): String = js.native
    
    /* CompleteClass */
    override def read(name: String): js.UndefOr[DataType | Null] = js.native
    
    /* CompleteClass */
    override def roll(): Unit = js.native
    
    /* CompleteClass */
    override def touch(name: String): Unit = js.native
    
    /* CompleteClass */
    override def write(name: String, data: DataType): Unit = js.native
  }
}
