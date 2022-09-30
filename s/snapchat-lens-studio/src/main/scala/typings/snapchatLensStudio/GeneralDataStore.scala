package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Class for storing and retrieving data based on keys. Used by PersistentStorageSystem. For more information, see the Persistent Storage guide. */
trait GeneralDataStore
  extends StObject
     with ScriptObject {
  
  /** Clears all data stored in the General Data Store. */
  def clear(): Unit
  
  /** Returns a boolean value stored under the given key, or false if none exists. */
  def getBool(key: String): Boolean
  
  /** Returns a boolean array being stored under the given key, or an empty array if none exists. */
  def getBoolArray(key: String): js.Array[Boolean]
  
  /** Returns a double precision floating point number stored under the given key, or 0 if none exists. */
  def getDouble(key: String): Double
  
  /** Returns a floating point value stored under the given key, or 0 if none exists. */
  def getFloat(key: String): Double
  
  /** Returns a floating point array being stored under the given key, or an empty array if none exists. */
  def getFloatArray(key: String): js.Array[Double]
  
  /** Returns an integer number stored under the given key, or 0 if none exists. */
  def getInt(key: String): Double
  
  /** Returns an integer array being stored under the given key, or an empty array if none exists. */
  def getIntArray(key: String): js.Array[Double]
  
  /** Returns a mat2 value stored under the given key, or a default mat2 if none exists. */
  def getMat2(key: String): mat2
  
  /** Returns a mat2 array being stored under the given key, or an empty array if none exists. */
  def getMat2Array(key: String): js.Array[mat2]
  
  /** Stores a mat3 value under the given key. */
  def getMat3(key: String): mat3
  
  /** Returns a mat3 array being stored under the given key, or an empty array if none exists. */
  def getMat3Array(key: String): js.Array[mat3]
  
  /** Returns a mat4 value stored under the given key, or a default mat4 if none exists. */
  def getMat4(key: String): mat4
  
  /** Returns a mat4 array being stored under the given key, or an empty array if none exists. */
  def getMat4Array(key: String): js.Array[mat4]
  
  /** Returns the maximum total size  in: allowed, bytes, of all data stored in this General Data Store. */
  def getMaxSizeInBytes(): Double
  
  /** Returns a quat value stored under the given key, or a default quat if none exists. */
  def getQuat(key: String): quat
  
  /** Returns a quat array being stored under the given key, or an empty array if none exists. */
  def getQuatArray(key: String): js.Array[quat]
  
  /** If onStoreFull has been set, this method returns the current total  in: size, bytes, of all data stored in this General Data Store. Otherwise, 0 is returned. */
  def getSizeInBytes(): Double
  
  /** Returns a string value stored under the given key, or empty string if none exists. */
  def getString(key: String): String
  
  /** Returns a string array being stored under the given key, or an empty array if none exists. */
  def getStringArray(key: String): js.Array[String]
  
  /** Returns a vec2 value stored under the given key, or a default vec2 if none exists. */
  def getVec2(key: String): vec2
  
  /** Returns a vec2 array being stored under the given key, or an empty array if none exists. */
  def getVec2Array(key: String): js.Array[vec2]
  
  /** Returns a vec3 value stored under the given key, or a default vec3 if none exists. */
  def getVec3(key: String): vec3
  
  /** Returns a vec3 array being stored under the given key, or an empty array if none exists. */
  def getVec3Array(key: String): js.Array[vec3]
  
  /** Returns a vec4 value stored under the given key, or a default vec4 if none exists. */
  def getVec4(key: String): vec4
  
  /** Returns a vec4 array being stored under the given key, or an empty array if none exists. */
  def getVec4Array(key: String): js.Array[vec4]
  
  /** Returns true if a value is being stored under the given key. */
  def has(key: String): Boolean
  
  /**
    * Callback function that gets called when the allowed storage limit has been passed. The store won’t be saved if it is full, so if this is called make sure to remove data until back under the
    * limit.
    */
  def onStoreFull(): Unit
  
  /** Stores a boolean value under the given key. */
  def putBool(key: String, value: Boolean): Unit
  
  /** Stores a boolean array under the given key. */
  def putBoolArray(key: String, value: js.Array[Boolean]): Unit
  
  /** Stores a double precision floating point number under the given key. */
  def putDouble(key: String, value: Double): Unit
  
  /** Stores a floating point value under the given key. */
  def putFloat(key: String, value: Double): Unit
  
  /** Stores a floating point array under the given key. */
  def putFloatArray(key: String, value: js.Array[Double]): Unit
  
  /** Stores an integer number value under the given key. */
  def putInt(key: String, value: Double): Unit
  
  /** Stores an integer array under the given key. */
  def putIntArray(key: String, value: js.Array[Double]): Unit
  
  /** Stores a mat2 value under the given key. */
  def putMat2(key: String, value: mat2): Unit
  
  /** Stores a mat2 array under the given key. */
  def putMat2Array(key: String, value: js.Array[mat2]): Unit
  
  /** Stores a mat3 value under the given key. */
  def putMat3(key: String, value: mat3): Unit
  
  /** Stores a mat3 array under the given key. */
  def putMat3Array(key: String, value: js.Array[mat3]): Unit
  
  /** Stores a mat4 value under the given key. */
  def putMat4(key: String, value: mat4): Unit
  
  /** Stores a mat4 array under the given key. */
  def putMat4Array(key: String, value: js.Array[mat4]): Unit
  
  /** Stores a quat value under the given key. */
  def putQuat(key: String, value: quat): Unit
  
  /** Stores a quat array under the given key. */
  def putQuatArray(key: String, value: js.Array[quat]): Unit
  
  /** Stores a string value under the given key. */
  def putString(key: String, value: String): Unit
  
  /** Stores a string array under the given key. */
  def putStringArray(key: String, value: js.Array[String]): Unit
  
  /** Stores a vec2 value under the given key. */
  def putVec2(key: String, value: vec2): Unit
  
  /** Stores a vec2 array under the given key. */
  def putVec2Array(key: String, value: js.Array[vec2]): Unit
  
  /** Stores a vec3 value under the given key. */
  def putVec3(key: String, value: vec3): Unit
  
  /** Stores a vec3 array under the given key. */
  def putVec3Array(key: String, value: js.Array[vec3]): Unit
  
  /** Stores a vec4 value under the given key. */
  def putVec4(key: String, value: vec4): Unit
  
  /** Stores a vec4 array under the given key. */
  def putVec4Array(key: String, value: js.Array[vec4]): Unit
  
  /** Removes the value being stored under the given key. If no value exists under the key, nothing will happen. */
  def remove(key: String): Unit
}
object GeneralDataStore {
  
  inline def apply(
    clear: () => Unit,
    getBool: String => Boolean,
    getBoolArray: String => js.Array[Boolean],
    getDouble: String => Double,
    getFloat: String => Double,
    getFloatArray: String => js.Array[Double],
    getInt: String => Double,
    getIntArray: String => js.Array[Double],
    getMat2: String => mat2,
    getMat2Array: String => js.Array[mat2],
    getMat3: String => mat3,
    getMat3Array: String => js.Array[mat3],
    getMat4: String => mat4,
    getMat4Array: String => js.Array[mat4],
    getMaxSizeInBytes: () => Double,
    getQuat: String => quat,
    getQuatArray: String => js.Array[quat],
    getSizeInBytes: () => Double,
    getString: String => String,
    getStringArray: String => js.Array[String],
    getTypeName: () => String,
    getVec2: String => vec2,
    getVec2Array: String => js.Array[vec2],
    getVec3: String => vec3,
    getVec3Array: String => js.Array[vec3],
    getVec4: String => vec4,
    getVec4Array: String => js.Array[vec4],
    has: String => Boolean,
    isOfType: String => Boolean,
    onStoreFull: () => Unit,
    putBool: (String, Boolean) => Unit,
    putBoolArray: (String, js.Array[Boolean]) => Unit,
    putDouble: (String, Double) => Unit,
    putFloat: (String, Double) => Unit,
    putFloatArray: (String, js.Array[Double]) => Unit,
    putInt: (String, Double) => Unit,
    putIntArray: (String, js.Array[Double]) => Unit,
    putMat2: (String, mat2) => Unit,
    putMat2Array: (String, js.Array[mat2]) => Unit,
    putMat3: (String, mat3) => Unit,
    putMat3Array: (String, js.Array[mat3]) => Unit,
    putMat4: (String, mat4) => Unit,
    putMat4Array: (String, js.Array[mat4]) => Unit,
    putQuat: (String, quat) => Unit,
    putQuatArray: (String, js.Array[quat]) => Unit,
    putString: (String, String) => Unit,
    putStringArray: (String, js.Array[String]) => Unit,
    putVec2: (String, vec2) => Unit,
    putVec2Array: (String, js.Array[vec2]) => Unit,
    putVec3: (String, vec3) => Unit,
    putVec3Array: (String, js.Array[vec3]) => Unit,
    putVec4: (String, vec4) => Unit,
    putVec4Array: (String, js.Array[vec4]) => Unit,
    remove: String => Unit
  ): GeneralDataStore = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), getBool = js.Any.fromFunction1(getBool), getBoolArray = js.Any.fromFunction1(getBoolArray), getDouble = js.Any.fromFunction1(getDouble), getFloat = js.Any.fromFunction1(getFloat), getFloatArray = js.Any.fromFunction1(getFloatArray), getInt = js.Any.fromFunction1(getInt), getIntArray = js.Any.fromFunction1(getIntArray), getMat2 = js.Any.fromFunction1(getMat2), getMat2Array = js.Any.fromFunction1(getMat2Array), getMat3 = js.Any.fromFunction1(getMat3), getMat3Array = js.Any.fromFunction1(getMat3Array), getMat4 = js.Any.fromFunction1(getMat4), getMat4Array = js.Any.fromFunction1(getMat4Array), getMaxSizeInBytes = js.Any.fromFunction0(getMaxSizeInBytes), getQuat = js.Any.fromFunction1(getQuat), getQuatArray = js.Any.fromFunction1(getQuatArray), getSizeInBytes = js.Any.fromFunction0(getSizeInBytes), getString = js.Any.fromFunction1(getString), getStringArray = js.Any.fromFunction1(getStringArray), getTypeName = js.Any.fromFunction0(getTypeName), getVec2 = js.Any.fromFunction1(getVec2), getVec2Array = js.Any.fromFunction1(getVec2Array), getVec3 = js.Any.fromFunction1(getVec3), getVec3Array = js.Any.fromFunction1(getVec3Array), getVec4 = js.Any.fromFunction1(getVec4), getVec4Array = js.Any.fromFunction1(getVec4Array), has = js.Any.fromFunction1(has), isOfType = js.Any.fromFunction1(isOfType), onStoreFull = js.Any.fromFunction0(onStoreFull), putBool = js.Any.fromFunction2(putBool), putBoolArray = js.Any.fromFunction2(putBoolArray), putDouble = js.Any.fromFunction2(putDouble), putFloat = js.Any.fromFunction2(putFloat), putFloatArray = js.Any.fromFunction2(putFloatArray), putInt = js.Any.fromFunction2(putInt), putIntArray = js.Any.fromFunction2(putIntArray), putMat2 = js.Any.fromFunction2(putMat2), putMat2Array = js.Any.fromFunction2(putMat2Array), putMat3 = js.Any.fromFunction2(putMat3), putMat3Array = js.Any.fromFunction2(putMat3Array), putMat4 = js.Any.fromFunction2(putMat4), putMat4Array = js.Any.fromFunction2(putMat4Array), putQuat = js.Any.fromFunction2(putQuat), putQuatArray = js.Any.fromFunction2(putQuatArray), putString = js.Any.fromFunction2(putString), putStringArray = js.Any.fromFunction2(putStringArray), putVec2 = js.Any.fromFunction2(putVec2), putVec2Array = js.Any.fromFunction2(putVec2Array), putVec3 = js.Any.fromFunction2(putVec3), putVec3Array = js.Any.fromFunction2(putVec3Array), putVec4 = js.Any.fromFunction2(putVec4), putVec4Array = js.Any.fromFunction2(putVec4Array), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[GeneralDataStore]
  }
  
  extension [Self <: GeneralDataStore](x: Self) {
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setGetBool(value: String => Boolean): Self = StObject.set(x, "getBool", js.Any.fromFunction1(value))
    
    inline def setGetBoolArray(value: String => js.Array[Boolean]): Self = StObject.set(x, "getBoolArray", js.Any.fromFunction1(value))
    
    inline def setGetDouble(value: String => Double): Self = StObject.set(x, "getDouble", js.Any.fromFunction1(value))
    
    inline def setGetFloat(value: String => Double): Self = StObject.set(x, "getFloat", js.Any.fromFunction1(value))
    
    inline def setGetFloatArray(value: String => js.Array[Double]): Self = StObject.set(x, "getFloatArray", js.Any.fromFunction1(value))
    
    inline def setGetInt(value: String => Double): Self = StObject.set(x, "getInt", js.Any.fromFunction1(value))
    
    inline def setGetIntArray(value: String => js.Array[Double]): Self = StObject.set(x, "getIntArray", js.Any.fromFunction1(value))
    
    inline def setGetMat2(value: String => mat2): Self = StObject.set(x, "getMat2", js.Any.fromFunction1(value))
    
    inline def setGetMat2Array(value: String => js.Array[mat2]): Self = StObject.set(x, "getMat2Array", js.Any.fromFunction1(value))
    
    inline def setGetMat3(value: String => mat3): Self = StObject.set(x, "getMat3", js.Any.fromFunction1(value))
    
    inline def setGetMat3Array(value: String => js.Array[mat3]): Self = StObject.set(x, "getMat3Array", js.Any.fromFunction1(value))
    
    inline def setGetMat4(value: String => mat4): Self = StObject.set(x, "getMat4", js.Any.fromFunction1(value))
    
    inline def setGetMat4Array(value: String => js.Array[mat4]): Self = StObject.set(x, "getMat4Array", js.Any.fromFunction1(value))
    
    inline def setGetMaxSizeInBytes(value: () => Double): Self = StObject.set(x, "getMaxSizeInBytes", js.Any.fromFunction0(value))
    
    inline def setGetQuat(value: String => quat): Self = StObject.set(x, "getQuat", js.Any.fromFunction1(value))
    
    inline def setGetQuatArray(value: String => js.Array[quat]): Self = StObject.set(x, "getQuatArray", js.Any.fromFunction1(value))
    
    inline def setGetSizeInBytes(value: () => Double): Self = StObject.set(x, "getSizeInBytes", js.Any.fromFunction0(value))
    
    inline def setGetString(value: String => String): Self = StObject.set(x, "getString", js.Any.fromFunction1(value))
    
    inline def setGetStringArray(value: String => js.Array[String]): Self = StObject.set(x, "getStringArray", js.Any.fromFunction1(value))
    
    inline def setGetVec2(value: String => vec2): Self = StObject.set(x, "getVec2", js.Any.fromFunction1(value))
    
    inline def setGetVec2Array(value: String => js.Array[vec2]): Self = StObject.set(x, "getVec2Array", js.Any.fromFunction1(value))
    
    inline def setGetVec3(value: String => vec3): Self = StObject.set(x, "getVec3", js.Any.fromFunction1(value))
    
    inline def setGetVec3Array(value: String => js.Array[vec3]): Self = StObject.set(x, "getVec3Array", js.Any.fromFunction1(value))
    
    inline def setGetVec4(value: String => vec4): Self = StObject.set(x, "getVec4", js.Any.fromFunction1(value))
    
    inline def setGetVec4Array(value: String => js.Array[vec4]): Self = StObject.set(x, "getVec4Array", js.Any.fromFunction1(value))
    
    inline def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    
    inline def setOnStoreFull(value: () => Unit): Self = StObject.set(x, "onStoreFull", js.Any.fromFunction0(value))
    
    inline def setPutBool(value: (String, Boolean) => Unit): Self = StObject.set(x, "putBool", js.Any.fromFunction2(value))
    
    inline def setPutBoolArray(value: (String, js.Array[Boolean]) => Unit): Self = StObject.set(x, "putBoolArray", js.Any.fromFunction2(value))
    
    inline def setPutDouble(value: (String, Double) => Unit): Self = StObject.set(x, "putDouble", js.Any.fromFunction2(value))
    
    inline def setPutFloat(value: (String, Double) => Unit): Self = StObject.set(x, "putFloat", js.Any.fromFunction2(value))
    
    inline def setPutFloatArray(value: (String, js.Array[Double]) => Unit): Self = StObject.set(x, "putFloatArray", js.Any.fromFunction2(value))
    
    inline def setPutInt(value: (String, Double) => Unit): Self = StObject.set(x, "putInt", js.Any.fromFunction2(value))
    
    inline def setPutIntArray(value: (String, js.Array[Double]) => Unit): Self = StObject.set(x, "putIntArray", js.Any.fromFunction2(value))
    
    inline def setPutMat2(value: (String, mat2) => Unit): Self = StObject.set(x, "putMat2", js.Any.fromFunction2(value))
    
    inline def setPutMat2Array(value: (String, js.Array[mat2]) => Unit): Self = StObject.set(x, "putMat2Array", js.Any.fromFunction2(value))
    
    inline def setPutMat3(value: (String, mat3) => Unit): Self = StObject.set(x, "putMat3", js.Any.fromFunction2(value))
    
    inline def setPutMat3Array(value: (String, js.Array[mat3]) => Unit): Self = StObject.set(x, "putMat3Array", js.Any.fromFunction2(value))
    
    inline def setPutMat4(value: (String, mat4) => Unit): Self = StObject.set(x, "putMat4", js.Any.fromFunction2(value))
    
    inline def setPutMat4Array(value: (String, js.Array[mat4]) => Unit): Self = StObject.set(x, "putMat4Array", js.Any.fromFunction2(value))
    
    inline def setPutQuat(value: (String, quat) => Unit): Self = StObject.set(x, "putQuat", js.Any.fromFunction2(value))
    
    inline def setPutQuatArray(value: (String, js.Array[quat]) => Unit): Self = StObject.set(x, "putQuatArray", js.Any.fromFunction2(value))
    
    inline def setPutString(value: (String, String) => Unit): Self = StObject.set(x, "putString", js.Any.fromFunction2(value))
    
    inline def setPutStringArray(value: (String, js.Array[String]) => Unit): Self = StObject.set(x, "putStringArray", js.Any.fromFunction2(value))
    
    inline def setPutVec2(value: (String, vec2) => Unit): Self = StObject.set(x, "putVec2", js.Any.fromFunction2(value))
    
    inline def setPutVec2Array(value: (String, js.Array[vec2]) => Unit): Self = StObject.set(x, "putVec2Array", js.Any.fromFunction2(value))
    
    inline def setPutVec3(value: (String, vec3) => Unit): Self = StObject.set(x, "putVec3", js.Any.fromFunction2(value))
    
    inline def setPutVec3Array(value: (String, js.Array[vec3]) => Unit): Self = StObject.set(x, "putVec3Array", js.Any.fromFunction2(value))
    
    inline def setPutVec4(value: (String, vec4) => Unit): Self = StObject.set(x, "putVec4", js.Any.fromFunction2(value))
    
    inline def setPutVec4Array(value: (String, js.Array[vec4]) => Unit): Self = StObject.set(x, "putVec4Array", js.Any.fromFunction2(value))
    
    inline def setRemove(value: String => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
  }
}
