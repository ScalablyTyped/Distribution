
# Scala.js typings for slash

Typings are for version 3.0.0

## Library description:
Convert Windows backslash paths to slash paths

|                    |                 |
| ------------------ | :-------------: |
| Full name          | slash |
| Keywords           | path, seperator, sep, slash, backslash, windows, win |
| # releases         | 2 |
| # dependents       | 585 |
| # downloads        | 290741828 |
| # stars            | 13 |

## Links
- [Homepage](https://github.com/sindresorhus/slash#readme)
- [Bugs](https://github.com/sindresorhus/slash/issues)
- [Repository](https://github.com/sindresorhus/slash)
- [Npm](https://www.npmjs.com/package/slash)
    


## Note
This library has been generated from typescript code from first party type definitions.

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
/**
Convert Windows backslash paths to slash paths: `foo\\bar` ➔ `foo/bar`.

[Forward-slash paths can be used in Windows](http://superuser.com/a/176395/6877) as long as they're not extended-length paths and don't contain any non-ascii characters.

@param path - A Windows backslash path.
@returns A path with forward slashes.

@example
```
import * as path from 'path';
import slash = require('slash');

const string = path.join('foo', 'bar');
// Unix    => foo/bar
// Windows => foo\\bar

slash(string);
// Unix    => foo/bar
// Windows => foo/bar
```
*/

```

