package typings.sinclairTypebox.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sinclair/typebox", "ExtendedTypeBuilder")
@js.native
open class ExtendedTypeBuilder () extends StandardTypeBuilder {
  
  /** `[Extended]` Creates a BigInt type */
  def BigInt(): TBigInt = js.native
  def BigInt(options: NumericOptions[js.BigInt]): TBigInt = js.native
  
  /** `[Extended]` Creates a Constructor type */
  def Constructor[T /* <: js.Array[TSchema] */, U /* <: TSchema */](
    parameters: /* import warning: importer.ImportType#apply c repeated non-array type: T */ js.Array[T],
    returns: U
  ): TConstructor[T, U] = js.native
  def Constructor[T /* <: js.Array[TSchema] */, U /* <: TSchema */](
    parameters: /* import warning: importer.ImportType#apply c repeated non-array type: T */ js.Array[T],
    returns: U,
    options: SchemaOptions
  ): TConstructor[T, U] = js.native
  
  /** `[Extended]` Extracts the ConstructorParameters from the given Constructor type */
  def ConstructorParameters[T /* <: TConstructor[js.Array[Any], Any] */](schema: T): TConstructorParameters[T] = js.native
  def ConstructorParameters[T /* <: TConstructor[js.Array[Any], Any] */](schema: T, options: SchemaOptions): TConstructorParameters[T] = js.native
  
  /** `[Extended]` Creates a Date type */
  def Date(): TDate = js.native
  def Date(options: DateOptions): TDate = js.native
  
  /** `[Extended]` Creates a Function type */
  def Function[T /* <: js.Array[TSchema] */, U /* <: TSchema */](
    parameters: /* import warning: importer.ImportType#apply c repeated non-array type: T */ js.Array[T],
    returns: U
  ): TFunction[T, U] = js.native
  def Function[T /* <: js.Array[TSchema] */, U /* <: TSchema */](
    parameters: /* import warning: importer.ImportType#apply c repeated non-array type: T */ js.Array[T],
    returns: U,
    options: SchemaOptions
  ): TFunction[T, U] = js.native
  
  /** `[Extended]` Extracts the InstanceType from the given Constructor */
  def InstanceType[T /* <: TConstructor[js.Array[Any], Any] */](schema: T): TInstanceType[T] = js.native
  def InstanceType[T /* <: TConstructor[js.Array[Any], Any] */](schema: T, options: SchemaOptions): TInstanceType[T] = js.native
  
  /** `[Extended]` Extracts the Parameters from the given Function type */
  def Parameters[T /* <: TFunction[js.Array[Any], Any] */](schema: T): TParameters[T] = js.native
  def Parameters[T /* <: TFunction[js.Array[Any], Any] */](schema: T, options: SchemaOptions): TParameters[T] = js.native
  
  /** `[Extended]` Creates a Promise type */
  def Promise[T /* <: TSchema */](item: T): TPromise[T] = js.native
  def Promise[T /* <: TSchema */](item: T, options: SchemaOptions): TPromise[T] = js.native
  
  /** `[Extended]` Creates a regular expression type */
  def RegEx(regex: js.RegExp): TString = js.native
  def RegEx(regex: js.RegExp, options: SchemaOptions): TString = js.native
  
  /** `[Extended]` Extracts the ReturnType from the given Function */
  def ReturnType[T /* <: TFunction[js.Array[Any], Any] */](schema: T): TReturnType[T] = js.native
  def ReturnType[T /* <: TFunction[js.Array[Any], Any] */](schema: T, options: SchemaOptions): TReturnType[T] = js.native
  
  /** `[Extended]` Creates a Symbol type */
  def Symbol(): TSymbol = js.native
  def Symbol(options: SchemaOptions): TSymbol = js.native
  
  /** `[Extended]` Creates a Uint8Array type */
  def Uint8Array(): TUint8Array = js.native
  def Uint8Array(options: Uint8ArrayOptions): TUint8Array = js.native
  
  /** `[Extended]` Creates a Undefined type */
  def Undefined(): TUndefined = js.native
  def Undefined(options: SchemaOptions): TUndefined = js.native
  
  /** `[Extended]` Creates a Void type */
  def Void(): TVoid = js.native
  def Void(options: SchemaOptions): TVoid = js.native
}
