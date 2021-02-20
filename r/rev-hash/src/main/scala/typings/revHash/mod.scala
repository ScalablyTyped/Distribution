package typings.revHash

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rev-hash", JSImport.Namespace)
  @js.native
  def apply(input: String): String = js.native
  /**
  Create a hash for file revving.
  @param input - Data to create a hash from.
  @example
  ```
  import * as fs from 'fs';
  import revisionHash = require('rev-hash');
  revisionHash(fs.readFileSync('unicorn.png'));
  //=> 'bb9d8fe615'
  revisionHash('Lorem ipsum dolor sit amet');
  //=> 'fea80f2db0'
  ```
  */
  @JSImport("rev-hash", JSImport.Namespace)
  @js.native
  def apply(input: Buffer): String = js.native
}
