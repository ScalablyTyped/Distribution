organization := "org.scalablytyped"
name := "promisify-supertest"
version := "v1.0.0-dt-20190322Z-480fd1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-bfc0a3",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-468aa7",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-831f18",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-c27d44",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190524Z-c3ce7d",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-6731ec",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190528Z-17198b",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-3e1146",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-d55a89",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20190312Z-58fb79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        