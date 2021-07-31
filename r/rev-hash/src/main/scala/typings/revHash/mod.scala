package typings.revHash

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(input: String): String = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[String]
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
  @scala.inline
  def apply(input: Buffer): String = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("rev-hash", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
