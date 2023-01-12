package typings.ronomonHashTable

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line no-single-declare-module
object mod {
  
  @JSImport("@ronomon/hash-table", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with HashTable {
    def this(keySize: Double, valueSize: Double, elementsMin: Double, elementsMax: Double) = this()
    
    /* CompleteClass */
    override def cache(key: Buffer, keyOffset: Double, value: Buffer, valueOffset: Double): Double = js.native
    
    /* CompleteClass */
    var capacity: Double = js.native
    
    /* CompleteClass */
    override def exist(key: Buffer, keyOffset: Double): Double = js.native
    
    /* CompleteClass */
    override def get(key: Buffer, keyOffset: Double, value: Buffer, valueOffset: Double): Double = js.native
    
    /* CompleteClass */
    var length: Double = js.native
    
    /* CompleteClass */
    var load: Double = js.native
    
    /* CompleteClass */
    override def set(key: Buffer, keyOffset: Double, value: Buffer, valueOffset: Double): Double = js.native
    
    /* CompleteClass */
    var size: Double = js.native
    
    /* CompleteClass */
    override def unset(key: Buffer, keyOffset: Double): Double = js.native
  }
  @JSImport("@ronomon/hash-table", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("@ronomon/hash-table", "BUCKETS_MAX")
  @js.native
  def BUCKETS_MAX: Double = js.native
  inline def BUCKETS_MAX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUCKETS_MAX")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("@ronomon/hash-table", "BUCKETS_MIN")
  @js.native
  def BUCKETS_MIN: Double = js.native
  inline def BUCKETS_MIN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUCKETS_MIN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("@ronomon/hash-table", "BUFFERS_MAX")
  @js.native
  def BUFFERS_MAX: Double = js.native
  inline def BUFFERS_MAX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUFFERS_MAX")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("@ronomon/hash-table", "BUFFERS_MIN")
  @js.native
  def BUFFERS_MIN: Double = js.native
  inline def BUFFERS_MIN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUFFERS_MIN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("@ronomon/hash-table", "BUFFER_MAX")
  @js.native
  def BUFFER_MAX: Double = js.native
  inline def BUFFER_MAX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUFFER_MAX")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("@ronomon/hash-table", "ELEMENTS_MAX")
  @js.native
  def ELEMENTS_MAX: Double = js.native
  inline def ELEMENTS_MAX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ELEMENTS_MAX")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("@ronomon/hash-table", "ELEMENTS_MIN")
  @js.native
  def ELEMENTS_MIN: Double = js.native
  inline def ELEMENTS_MIN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ELEMENTS_MIN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("@ronomon/hash-table", "ERROR_MAXIMUM_CAPACITY_EXCEEDED")
  @js.native
  def ERROR_MAXIMUM_CAPACITY_EXCEEDED: String = js.native
  inline def ERROR_MAXIMUM_CAPACITY_EXCEEDED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_MAXIMUM_CAPACITY_EXCEEDED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("@ronomon/hash-table", "ERROR_MODE")
  @js.native
  def ERROR_MODE: String = js.native
  inline def ERROR_MODE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_MODE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("@ronomon/hash-table", "ERROR_SET")
  @js.native
  def ERROR_SET: String = js.native
  inline def ERROR_SET_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_SET")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("@ronomon/hash-table", "KEY_MAX")
  @js.native
  def KEY_MAX: Double = js.native
  inline def KEY_MAX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KEY_MAX")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("@ronomon/hash-table", "KEY_MIN")
  @js.native
  def KEY_MIN: Double = js.native
  inline def KEY_MIN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KEY_MIN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("@ronomon/hash-table", "VALUE_MAX")
  @js.native
  def VALUE_MAX: Double = js.native
  inline def VALUE_MAX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VALUE_MAX")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("@ronomon/hash-table", "VALUE_MIN")
  @js.native
  def VALUE_MIN: Double = js.native
  inline def VALUE_MIN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VALUE_MIN")(x.asInstanceOf[js.Any])
  
  trait HashTable extends StObject {
    
    def cache(key: Buffer, keyOffset: Double, value: Buffer, valueOffset: Double): Double
    
    var capacity: Double
    
    def exist(key: Buffer, keyOffset: Double): Double
    
    def get(key: Buffer, keyOffset: Double, value: Buffer, valueOffset: Double): Double
    
    var length: Double
    
    var load: Double
    
    def set(key: Buffer, keyOffset: Double, value: Buffer, valueOffset: Double): Double
    
    var size: Double
    
    def unset(key: Buffer, keyOffset: Double): Double
  }
  object HashTable {
    
    inline def apply(
      cache: (Buffer, Double, Buffer, Double) => Double,
      capacity: Double,
      exist: (Buffer, Double) => Double,
      get: (Buffer, Double, Buffer, Double) => Double,
      length: Double,
      load: Double,
      set: (Buffer, Double, Buffer, Double) => Double,
      size: Double,
      unset: (Buffer, Double) => Double
    ): HashTable = {
      val __obj = js.Dynamic.literal(cache = js.Any.fromFunction4(cache), capacity = capacity.asInstanceOf[js.Any], exist = js.Any.fromFunction2(exist), get = js.Any.fromFunction4(get), length = length.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], set = js.Any.fromFunction4(set), size = size.asInstanceOf[js.Any], unset = js.Any.fromFunction2(unset))
      __obj.asInstanceOf[HashTable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HashTable] (val x: Self) extends AnyVal {
      
      inline def setCache(value: (Buffer, Double, Buffer, Double) => Double): Self = StObject.set(x, "cache", js.Any.fromFunction4(value))
      
      inline def setCapacity(value: Double): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
      
      inline def setExist(value: (Buffer, Double) => Double): Self = StObject.set(x, "exist", js.Any.fromFunction2(value))
      
      inline def setGet(value: (Buffer, Double, Buffer, Double) => Double): Self = StObject.set(x, "get", js.Any.fromFunction4(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLoad(value: Double): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
      
      inline def setSet(value: (Buffer, Double, Buffer, Double) => Double): Self = StObject.set(x, "set", js.Any.fromFunction4(value))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setUnset(value: (Buffer, Double) => Double): Self = StObject.set(x, "unset", js.Any.fromFunction2(value))
    }
  }
}
