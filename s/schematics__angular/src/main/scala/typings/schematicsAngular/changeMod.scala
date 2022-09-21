package typings.schematicsAngular

import typings.angularDevkitSchematics.treeInterfaceMod.UpdateRecorder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object changeMod {
  
  @JSImport("@schematics/angular/utility/change", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@schematics/angular/utility/change", "InsertChange")
  @js.native
  open class InsertChange protected ()
    extends StObject
       with Change {
    def this(path: String, pos: Double, toAdd: String) = this()
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(host: Host): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override val description: String = js.native
    
    /* CompleteClass */
    override val order: Double = js.native
    
    /* CompleteClass */
    override val path: String | Null = js.native
    @JSName("path")
    var path_InsertChange: String = js.native
    
    var pos: Double = js.native
    
    var toAdd: String = js.native
  }
  
  @JSImport("@schematics/angular/utility/change", "NoopChange")
  @js.native
  open class NoopChange ()
    extends StObject
       with Change {
    
    @JSName("apply")
    def apply(): js.Promise[Unit] = js.native
    /* CompleteClass */
    @JSName("apply")
    override def apply(host: Host): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override val description: String = js.native
    
    /* CompleteClass */
    override val order: Double = js.native
    
    /* CompleteClass */
    override val path: String | Null = js.native
    @JSName("path")
    var path_NoopChange: Null = js.native
  }
  
  @JSImport("@schematics/angular/utility/change", "RemoveChange")
  @js.native
  open class RemoveChange protected ()
    extends StObject
       with Change {
    def this(path: String, pos: Double, toRemove: String) = this()
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(host: Host): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override val description: String = js.native
    
    /* CompleteClass */
    override val order: Double = js.native
    
    /* CompleteClass */
    override val path: String | Null = js.native
    @JSName("path")
    var path_RemoveChange: String = js.native
    
    /* private */ var pos: Any = js.native
    
    var toRemove: String = js.native
  }
  
  @JSImport("@schematics/angular/utility/change", "ReplaceChange")
  @js.native
  open class ReplaceChange protected ()
    extends StObject
       with Change {
    def this(path: String, pos: Double, oldText: String, newText: String) = this()
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(host: Host): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override val description: String = js.native
    
    var newText: String = js.native
    
    var oldText: String = js.native
    
    /* CompleteClass */
    override val order: Double = js.native
    
    /* CompleteClass */
    override val path: String | Null = js.native
    @JSName("path")
    var path_ReplaceChange: String = js.native
    
    /* private */ var pos: Any = js.native
  }
  
  inline def applyToUpdateRecorder(recorder: UpdateRecorder, changes: js.Array[Change]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyToUpdateRecorder")(recorder.asInstanceOf[js.Any], changes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Change extends StObject {
    
    @JSName("apply")
    def apply(host: Host): js.Promise[Unit]
    
    val description: String
    
    val order: Double
    
    val path: String | Null
  }
  object Change {
    
    inline def apply(apply: Host => js.Promise[Unit], description: String, order: Double): Change = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), description = description.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], path = null)
      __obj.asInstanceOf[Change]
    }
    
    extension [Self <: Change](x: Self) {
      
      inline def setApply(value: Host => js.Promise[Unit]): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathNull: Self = StObject.set(x, "path", null)
    }
  }
  
  trait Host extends StObject {
    
    def read(path: String): js.Promise[String]
    
    def write(path: String, content: String): js.Promise[Unit]
  }
  object Host {
    
    inline def apply(read: String => js.Promise[String], write: (String, String) => js.Promise[Unit]): Host = {
      val __obj = js.Dynamic.literal(read = js.Any.fromFunction1(read), write = js.Any.fromFunction2(write))
      __obj.asInstanceOf[Host]
    }
    
    extension [Self <: Host](x: Self) {
      
      inline def setRead(value: String => js.Promise[String]): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
      
      inline def setWrite(value: (String, String) => js.Promise[Unit]): Self = StObject.set(x, "write", js.Any.fromFunction2(value))
    }
  }
}
