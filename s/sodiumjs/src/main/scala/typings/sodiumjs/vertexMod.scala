package typings.sodiumjs

import org.scalablytyped.runtime.TopLevel
import typings.typescriptCollections.mod.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodiumjs/dist/typings/sodium/Vertex", JSImport.Namespace)
@js.native
object vertexMod extends js.Object {
  
  def describeAll(v: Vertex, visited: Set[Double]): Unit = js.native
  
  def getTotalRegistrations(): Double = js.native
  
  def setVerbose(v: Boolean): Unit = js.native
  
  @js.native
  sealed trait Color extends js.Object
  @js.native
  object Color extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Color with Double] = js.native
    
    @js.native
    sealed trait black extends Color
    /* 0 */ @js.native
    object black extends TopLevel[black with Double]
    
    @js.native
    sealed trait gray extends Color
    /* 1 */ @js.native
    object gray extends TopLevel[gray with Double]
    
    @js.native
    sealed trait purple extends Color
    /* 3 */ @js.native
    object purple extends TopLevel[purple with Double]
    
    @js.native
    sealed trait white extends Color
    /* 2 */ @js.native
    object white extends TopLevel[white with Double]
  }
  
  @js.native
  class Source protected () extends js.Object {
    def this(origin: Vertex, register_ : js.Function0[js.Function0[Unit]]) = this()
    
    def deregister(target: Vertex): Unit = js.native
    
    var deregister_ : js.Any = js.native
    
    var origin: Vertex = js.native
    
    def register(target: Vertex): Unit = js.native
    
    var register_ : js.Any = js.native
    
    var registered: js.Any = js.native
  }
  
  @js.native
  class Vertex protected () extends js.Object {
    def this(name: String, rank: Double, sources: js.Array[Source]) = this()
    
    def addSource(src: Source): Unit = js.native
    
    var buffered: Boolean = js.native
    
    def children(): js.Array[Vertex] = js.native
    
    var childrn: js.Array[Vertex] = js.native
    
    def collectWhite(): Unit = js.native
    
    var color: Color = js.native
    
    var decRefCount: js.Any = js.native
    
    def decrement(referrer: Vertex): Unit = js.native
    
    def deregister(target: Vertex): Unit = js.native
    
    def descr(): String = js.native
    
    var ensureBiggerThan: js.Any = js.native
    
    def free(): Unit = js.native
    
    var id: Double = js.native
    
    var incRefCount: js.Any = js.native
    
    def increment(referrer: Vertex): Boolean = js.native
    
    def markGray(): Unit = js.native
    
    var name: String = js.native
    
    def possibleRoots(): Unit = js.native
    
    var rank: Double = js.native
    
    def refCount(): Double = js.native
    
    var refCountAdj: Double = js.native
    
    def register(target: Vertex): Boolean = js.native
    
    def release(): Unit = js.native
    
    def scan(): Unit = js.native
    
    def scanBlack(): Unit = js.native
    
    var sources: js.Array[Source] = js.native
    
    var targets: js.Array[Vertex] = js.native
    
    var visited: Boolean = js.native
  }
  /* static members */
  @js.native
  object Vertex extends js.Object {
    
    var NULL: Vertex = js.native
    
    def collectCycles(): Unit = js.native
    
    def collectRoots(): Unit = js.native
    
    var collectingCycles: Boolean = js.native
    
    def markRoots(): Unit = js.native
    
    def scanRoots(): Unit = js.native
    
    var toBeFreedList: js.Array[Vertex] = js.native
  }
}
